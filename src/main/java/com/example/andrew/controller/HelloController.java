package com.example.andrew.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Annotation
@Controller
// Main class
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody

    // Method
    public String helloTest()
    {
        return "Hello tat oki!";
    }
}