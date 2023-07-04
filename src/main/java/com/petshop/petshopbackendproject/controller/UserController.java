package com.petshop.petshopbackendproject.controller;


import com.petshop.petshopbackendproject.model.LoginRequest;
import com.petshop.petshopbackendproject.model.User;
import com.petshop.petshopbackendproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String email = loginRequest.getEmail();
        String password = loginRequest.getPassword();


        boolean userExists = userService.findUserByEmailAndPassword(email, password);

        return ResponseEntity.ok().body(userExists);
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {

        userService.saveUser(user);

        return ResponseEntity.ok().body(true);
    }
    @PostMapping("/checkEmail")
    public ResponseEntity<Boolean> checkEmailExists(@RequestBody Map<String, String> requestBody) {
        String email = requestBody.get("email");
        boolean emailExists = userService.checkEmailExists(email);
        return ResponseEntity.ok(emailExists);
    }








}
