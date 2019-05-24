package com.sagar.myapp.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sagar.myapp.service.OneService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OneServiceImpl implements OneService {

    @Override
    @HystrixCommand(fallbackMethod = "fallback")
    public String doSomeOperation() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8081/one";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return response.getBody().toString();
    }

    public String fallback() {
        return "fallback for OneService";
    }
}
