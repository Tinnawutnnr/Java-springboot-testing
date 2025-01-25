package com.example.training;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HeaderController {

    @GetMapping("/test-header")
    public String testHeader(
            @RequestHeader("Accept-Encoding") String headerFromRequest,
            @RequestHeader("User-Agent") String userAgent
            //@RequestHeader("myHeader") String header2

    ) {
        System.out.println(headerFromRequest);
        //return header2;
        return headerFromRequest;
    }

    @GetMapping("/test-header-2")
    public String testHeader2(
            @RequestHeader Map<String, String> header
    ) {
        return header.get("User-Agent".toLowerCase());
    }
}
