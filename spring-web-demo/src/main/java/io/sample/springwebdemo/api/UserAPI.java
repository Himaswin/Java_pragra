package io.sample.springwebdemo.api;
import io.sample.springwebdemo.Entity.Error;
import io.sample.springwebdemo.Entity.User;
import io.sample.springwebdemo.exception.UserNotFoundException;
import io.sample.springwebdemo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@RestController
public class UserAPI {

    private final UserService userService;

    public UserAPI(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/users")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = User.class)
                    )
            ),
            @ApiResponse(responseCode = "404", description = "Not Found",
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = Error.class)
                    )
            ),

    })

    public ResponseEntity<?> getAllUsers(@RequestHeader(value = "User-Agent", required = false) String userAgent,
                @RequestParam(value = "lastName", required = false) String lastName,
                @RequestParam(value = "firstName", required = false) String firstName){
        List<User> allUsers = userService.getAllUsers();
        if(allUsers.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).header("X_Responder", "pragra...").body(
                    Error.builder().code("Not-found-404").
                            message(!userAgent.toUpperCase().contains("POSTMAN") ? "No users found" : "No users found for POSTMAN").build()
            );
        }
        return ResponseEntity.status(HttpStatus.OK).body(allUsers);
    }

    @GetMapping("/api/download")
    public ResponseEntity<?> downloaddoc() {
        Path filePath = Path.of("C:/Users/Himaswin/Downloads/Fee.pdf");

        if (!Files.exists(filePath) || !Files.isRegularFile(filePath)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Error.builder()
                            .code("File-not-found")
                            .message("File not found")
                            .build());
        }

        try {
            byte[] bytes = Files.readAllBytes(filePath);

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_PDF)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"Fee.pdf\"")
                    .body(bytes);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Error.builder()
                            .code("File-read-error")
                            .message("Could not read the file")
                            .build());
        }
    }

    @PostMapping("/api/users")
    @Operation(summary = "Create a new user", description = "Create a new user in the system")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201",
                content = @Content(
                        mediaType = "application/json",
                        schema = @Schema(implementation = User.class)
                ),
                description = "User created successfully"),
    })
    @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "User object to be created", required = true,
    content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)))

    public ResponseEntity<?> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
            content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = User.class)
            )),
            @ApiResponse(responseCode = "200",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = User.class)
            )),
            @ApiResponse(responseCode = "404",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(implementation = Error.class)
            )),
            @ApiResponse(responseCode = "400",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = User.class)
            ))

    })

////    @GetMapping("/api/users/{id}")
//    @RequestMapping(value = "/api/users/{id}", method = RequestMethod.GET, consumes = {"application/json", "application/xml"}, produces = "application/json")
//    public ResponseEntity<?> getUserbyId(@PathVariable("id") Long userId){
////        if(userId == null || userId < 0){
////            throw new IllegalArgumentException("Invalid user id");
////        }
//       try{
//           User userById = userService.getUserById(userId);
//           return ResponseEntity.status(HttpStatus.OK).body(userById);
//       } catch(UserNotFoundException e){
//           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
//                   Error.builder().code("not found 404").message(e.getMessage()).build()
//           );
//       }
//    }
// easier way and more cleaner
    @RequestMapping(value = "/api/users/{id}", method = RequestMethod.GET, consumes = {"application/json", "application/xml"}, produces = "application/json")
    public ResponseEntity<User> getUserbyId(@PathVariable("id") Long userId){

        User user = userService.getUserById(userId);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}