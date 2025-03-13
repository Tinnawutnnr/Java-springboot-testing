package com.example.training;

import org.apache.catalina.User;
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

    @GetMapping("/test-json")
    public UserData simpleReturn() {

        UserData userData = new UserData();

        userData.setFirstName("John");
        userData.setLastName("Doe");
        return userData;


    }

    // Return userData
    @GetMapping("/test-401")
    public ResponseEntity<Object> returnStatus401(
            @RequestParam("input") String input
    ) {
        UserData userData = new UserData();

        if ("hacker".equals(input)) {
            ErrorObject errorObject = new ErrorObject();
            errorObject.setErrorMessage("Invalid input");
//            userData.setFirstName("Hacker");
//            userData.setLastName("Hacker");
//            return ResponseEntity.status(401).build();
            return ResponseEntity.status(401).body(errorObject);
        } else {

            userData.setFirstName("John");
            userData.setLastName("Doe");
            return ResponseEntity.ok(userData);
        }

    }
}
