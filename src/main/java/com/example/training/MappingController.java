package com.example.training;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingController {

    public String helloWorld() {
        return "Hello World";
    }
}
