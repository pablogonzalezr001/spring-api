package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hola desde Spring Boot" + java.time.LocalDateTime.now();
    }
}
