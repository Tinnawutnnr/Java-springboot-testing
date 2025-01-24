package com.example.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("training")
    public String hello() {
        System.out.println("Hello World");
        return "Hello World";
    }
}
