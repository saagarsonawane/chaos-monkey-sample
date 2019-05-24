package com.sagar.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/one")
    public String getName(){
        return "Result From One";
    }
}
