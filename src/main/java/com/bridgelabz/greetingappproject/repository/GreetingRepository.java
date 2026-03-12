package com.bridgelabz.greetingappproject.repository;

import com.bridgelabz.greetingappproject.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}