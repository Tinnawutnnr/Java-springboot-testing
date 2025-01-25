package com.example.training;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormSubmitData {

    @PostMapping("/login")
    public String login(
            @ModelAttribute UserCredential inputFromFormSubmit
    ) {
        System.out.println("username:" + inputFromFormSubmit.getUsername());
        System.out.println("password:" + inputFromFormSubmit.getPassword());

        return "login success";
    }
}
