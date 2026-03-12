package com.bridgelabz.greetingappproject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "Hello from BridgeLabz";
    }

    @PostMapping
    public String postGreeting() {
        return "POST request received";
    }

    @PutMapping
    public String putGreeting() {
        return "PUT request received";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "DELETE request received";
    }
}