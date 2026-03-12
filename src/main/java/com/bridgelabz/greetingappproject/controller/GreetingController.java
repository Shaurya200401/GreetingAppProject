package com.bridgelabz.greetingappproject.controller;

import com.bridgelabz.greetingappproject.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greeting() {
        return greetingService.getGreeting();
    }

}