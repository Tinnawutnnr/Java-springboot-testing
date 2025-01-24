package com.example.training;

import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "testing";
    }

    @PostMapping("/hello-world2")
    public String helloWorld2() {
        return "testing2";
    }

    @RequestMapping(path = "/hello-world3", method = {
            RequestMethod.POST,
            RequestMethod.GET
    })
    public String helloWorld3() {
        return "testing3";
    }
}
