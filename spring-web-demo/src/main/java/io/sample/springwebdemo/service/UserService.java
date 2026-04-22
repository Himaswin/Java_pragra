package io.sample.springwebdemo.service;

import io.sample.springwebdemo.Entity.User;
import io.sample.springwebdemo.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

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


}
