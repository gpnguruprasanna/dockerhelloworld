package com.guru.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloworld(){
        return "Hello world";
    }

    @GetMapping("/hello-world-v1")
    public String helloworldv1(){
        return "Hello world-v1";
    }
}
