package com.example.training;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class JsonController {

    @PostMapping("/login-with-json")
    public String loginWithJson(
            @RequestBody UserCredential inputJsonFromClient
    ) {
        System.out.println("Success");
        return String.format("%s : %s", inputJsonFromClient.getUsername(), inputJsonFromClient.getPassword());
    }
}
