package io.sample.springwebdemo.service;

import io.sample.springwebdemo.Entity.User;
import io.sample.springwebdemo.exception.UserNotFoundException;
import io.sample.springwebdemo.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User createUser(User user){
        user.setCreated_at(Instant.now());
        return userRepo.save(user);
    }

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    public User getUserById(Long userId){
        if(userId == null || userId < 0){
            throw new IllegalArgumentException("Invalid user id");
        }
        Optional<User> byId = userRepo.findById(userId);
        User user = byId.orElseThrow(() -> new UserNotFoundException("User not found with id: " + userId));
        return user;
    }

}
