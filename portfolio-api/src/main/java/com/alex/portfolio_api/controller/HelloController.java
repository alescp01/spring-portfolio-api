package com.alex.portfolio_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hola, esta es tu primera API con Spring Boot";
    }

    @GetMapping("/api/bye")
    public String bye() {
        return "Bye, esta es tu primera API con Spring Boot";
    }

    @GetMapping("/api/user")
    public UserResponse getUser() {
        return new UserResponse("Alex", "Junior Developer", "Madrid");
    }
}
