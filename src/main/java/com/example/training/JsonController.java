package com.example.training;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JsonController {

    @PostMapping("/login-with-json")
    public String loginWithJson(
            @RequestBody UserCredential inputJsonFromClient
    ) {
        System.out.println("Success");
        return String.format("%s : %s", inputJsonFromClient.getUsername(), inputJsonFromClient.getPassword());
    }

    @GetMapping("test-JSON")
    public UserData simpleReturn() {
        UserData userData = new UserData();
        userData.setFirstName("John");
        userData.setLastName("Doe");
        return userData;
    }

    @GetMapping("test-401")
    public ResponseEntity<UserData> returnStatus401(
            @RequestParam("input") String input
    ) {
        if("hacker".equals(input)) {
            UserData userData = new UserData();
            userData.setFirstName("Hacker");
            userData.setLastName("Hackers");
            return ResponseEntity.status(401).body(userData);
        } else{
            UserData userData = new UserData();
            userData.setFirstName("John");
            userData.setLastName("Doe");
            return ResponseEntity.ok(userData);
        }
    }
}
