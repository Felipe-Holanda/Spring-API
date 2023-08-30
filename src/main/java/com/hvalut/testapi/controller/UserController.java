package com.hvalut.testapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hvalut.testapi.model.User;
import com.hvalut.testapi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody final User userData){
        final User createdUser = userService.createUser(userData);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED); 
    }

    @GetMapping
    public ResponseEntity<List<User>> readUsers(){
        final List<User> allUsers = userService.readUsers();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }
}
