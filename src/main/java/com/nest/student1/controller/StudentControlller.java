package com.nest.student1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControlller {

    @GetMapping("/")
    public String Homepage() {
        return "Welcome to the homepage";

    }
    @GetMapping("/contact")
    public String contact() {
        return "this is my contact page";

    }


}
