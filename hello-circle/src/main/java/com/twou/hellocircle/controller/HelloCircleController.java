package com.twou.hellocircle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCircleController {

    @GetMapping(value = "/hello")
    public String helloCircle(){
        // return hello circle
        return "Hello, Circle!";
    }

    @GetMapping(value="/answer")
    public String getAnswer() {
        return "The answer is 42!";
    }
}