package com.being_infinity.springboot_beginner.controllers;

import com.being_infinity.springboot_beginner.models.User;
import com.being_infinity.springboot_beginner.services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User res=userService.getUserById(id);
        if(res!=null){
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
public User addNewUser(@RequestBody User user) {
    return userService.addnewUser(user);
}
}