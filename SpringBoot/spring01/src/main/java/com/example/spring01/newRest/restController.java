package com.example.spring01.newRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
    @GetMapping("/")
    public String hello()
    {
        return "Hello World";
    }
}
