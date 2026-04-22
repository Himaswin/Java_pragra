package io.sample.springwebdemo.controller;


import io.sample.springwebdemo.Entity.User;
import io.sample.springwebdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/{name}")
//    public String index(@PathVariable String name,  Model model){
//        model.addAttribute("user", name);
//        return "index";
//    }

    @GetMapping("/user")
    public String userIndex(Model model){
//        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("user", new User());
        return "user/index";
    }

    @PostMapping("/user/add")
    public String createUser(@ModelAttribute("user") User user, Model model){
        model.addAttribute("user", user);
        userService.createUser(user);
        model.addAttribute("message", "User created successfully");
        model.addAttribute("users", userService.getAllUsers());
        return "user/add";
    }
}
