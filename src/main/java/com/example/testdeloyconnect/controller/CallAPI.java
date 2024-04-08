package com.example.testdeloyconnect.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/test")
public class CallAPI {

    @RequestMapping(value = "/hello")
    public String callAPI() {
        return "Hello";
    }
}
