package com.rafacrud.fullstackbackend.controller;

import com.rafacrud.fullstackbackend.exception.usernotfoundexception;
import com.rafacrud.fullstackbackend.model.User;
import com.rafacrud.fullstackbackend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
    
    @GetMapping
    List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    User getUserbyId (@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new usernotfoundexception(id));
    }
}
