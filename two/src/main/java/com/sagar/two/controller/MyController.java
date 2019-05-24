package com.sagar.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/two")
    public String getName(){
        return "Result From Two";
    }
}
