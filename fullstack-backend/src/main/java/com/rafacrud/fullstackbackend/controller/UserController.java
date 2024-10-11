package com.rafacrud.fullstackbackend.controller;


import com.rafacrud.fullstackbackend.exception.usernotfoundexception;
import com.rafacrud.fullstackbackend.model.User;
import com.rafacrud.fullstackbackend.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User Endpoints")
@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Operation(summary = "Create User")
    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @Operation(summary = "Get all users")
    @GetMapping("/users")
    List<User> getAllUsers () {
        return userRepository.findAll();
    }

    @Operation(summary = "Get user by id")
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new usernotfoundexception(id));
    }

    @Operation(summary = "Update User")
    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setUsername(newUser.getUsername());
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                }).orElseThrow(() -> new usernotfoundexception(id));
    }

    @Operation(summary = "Delete User")
    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id) {
        if(!userRepository.existsById(id)) {
            throw new usernotfoundexception(id);
        }
        userRepository.deleteById(id);
        return "Usuário de id " + id + " foi deletado com sucesso.";
    }
}
