package com.sagar.myapp.rest.controller;

import com.sagar.myapp.service.OneService;
import com.sagar.myapp.service.TwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    OneService oneService;

    @Autowired
    TwoService twoService;

    @GetMapping("/results")
    public String getName(){
        String oneResult = oneService.doSomeOperation();
        String twoResult = twoService.doSomeOperation();
        return oneResult+" *** "+twoResult;
    }
}
