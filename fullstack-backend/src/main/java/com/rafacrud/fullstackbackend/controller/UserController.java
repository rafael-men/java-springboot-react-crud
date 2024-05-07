package com.rafacrud.fullstackbackend.controller;

import com.rafacrud.fullstackbackend.model.User;
import com.rafacrud.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   
    @Autowired
    private UserRepository userRepository;
    
   
}
