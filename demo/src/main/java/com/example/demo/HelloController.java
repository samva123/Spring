package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //it is a gateway to write endpoint
    @GetMapping("hello")
    public String hello(){
        return "Hello World ji";
    }
}
