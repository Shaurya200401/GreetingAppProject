package com.bridgelabz.greetingappproject.controller;

import com.bridgelabz.greetingappproject.entity.Greeting;
import com.bridgelabz.greetingappproject.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service) {
        this.service = service;
    }

    // UC4 — Save Greeting
    @PostMapping("/save")
    public Greeting saveGreeting(@RequestParam String message){

        return service.saveGreeting(message);
    }
    @GetMapping("/{id}")
    public Greeting getGreetingById(@PathVariable Long id) {
        return service.getGreetingById(id);
    }
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return service.getAllGreetings();
    }
    @PutMapping("/{id}")
    public Greeting updateGreeting(
            @PathVariable Long id,
            @RequestParam String message) {

        return service.updateGreeting(id, message);
    }
}