package com.example.Microservices.userms.controller;

import com.example.Microservices.userms.model.User;
import com.example.Microservices.userms.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User saved=userService.getUser(id);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User saved=userService.createUser(user);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
}
