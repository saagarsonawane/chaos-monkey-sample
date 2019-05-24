package com.sagar.myapp.service.impl;

import com.sagar.myapp.service.TwoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TwoServiceImpl implements TwoService {
    @Override
    public String doSomeOperation() {

        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://localhost:8082/two";
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl, String.class);
        return response.getBody().toString();
    }
}
