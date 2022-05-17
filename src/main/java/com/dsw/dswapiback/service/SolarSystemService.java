package com.dsw.dswapiback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import static com.dsw.dswapiback.util.SolarSystemURL.URL_ALL;

@Service
public class SolarSystemService {
    
    private final RestTemplate restTemplate;
    
    @Autowired
    public SolarSystemService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public ResponseEntity<Object> findAllList() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_ALL, Object.class));
    }
}
