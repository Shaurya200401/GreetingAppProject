package com.bridgelabz.greetingappproject.service;

import com.bridgelabz.greetingappproject.entity.Greeting;
import com.bridgelabz.greetingappproject.repository.GreetingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public Greeting saveGreeting(String message) {

        Greeting greeting = new Greeting();
        greeting.setMessage(message);

        return repository.save(greeting);
    }

    public Greeting getGreetingById(Long id) {
        return repository.findById(id).orElse(null);
    }

    //UC7
    public Greeting updateGreeting(Long id, String message) {

        Greeting greeting = repository.findById(id).orElse(null);

        if(greeting != null){
            greeting.setMessage(message);
            return repository.save(greeting);
        }

        return null;
    }
    //UC8
    public void deleteGreeting(Long id){
        repository.deleteById(id);
    }
    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }

}