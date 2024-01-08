package com.category.tree.application.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SayHelloController {

    @GetMapping("/hello")
    String hello() {
        return "hello world";
    }

}
