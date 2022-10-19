package com.java.d3v3lop3r.springsecurity_first_steps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("welcome")
    public String welcome(){
        return "Hello World, from secured endpoint";
    }

}
