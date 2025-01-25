package com.example.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {

    @GetMapping("/test-param")
    public String mappingTest(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "surname") String surname

    ) {
        System.out.println("Name : " + name );
        System.out.println("Surname : " + surname );

        return "Name : " + name + "<br>" + " Surname : " + surname;

    }
}
