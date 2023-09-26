package com.woodhill.user.service.controllers;

import com.woodhill.user.service.entities.User;
import com.woodhill.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserController class provides REST endpoints for managing users.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Creates a new user.
     *
     * @param user the user to be created
     * @return a ResponseEntity containing the created user and a status code of 201 Created
     */
    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

    /**
     * Gets a single user by ID.
     *
     * @param userId the ID of the user to be retrieved
     * @return a ResponseEntity containing the user with the given ID and a status code of 200 OK
     */
    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    /**
     * Gets all users.
     *
     * @return a ResponseEntity containing a list of all users and a status code of 200 OK
     */
    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUsers = userService.getAllUser();
        return ResponseEntity.ok(allUsers);
    }
}
