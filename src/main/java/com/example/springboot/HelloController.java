package com.example.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @CrossOrigin
    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot BE!";
    }

}