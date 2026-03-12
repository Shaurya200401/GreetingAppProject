package com.bridgelabz.greetingappproject.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting() {
        return "Hello World";
    }

}