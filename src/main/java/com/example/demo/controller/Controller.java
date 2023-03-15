package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @RequestMapping(value = "/")
    public String root() {
        return "Hello";
    }

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Say Hello";
    }
}
