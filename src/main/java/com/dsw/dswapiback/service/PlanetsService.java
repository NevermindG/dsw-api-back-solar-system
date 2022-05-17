package com.dsw.dswapiback.service;

import com.dsw.dswapiback.model.Planets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import static com.dsw.dswapiback.util.PlanetsURL.*;

@Service
public class PlanetsService {
    
    private final RestTemplate restTemplate;
    
    @Autowired
    public PlanetsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    
    public ResponseEntity<Planets> findJupiter() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_JUPITER, Planets.class));
        
    }
    
    public ResponseEntity<Planets> findMars() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_MARS, Planets.class));
    }
    
    public ResponseEntity<Planets> findMercury() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_MERCURY, Planets.class));
    }
    
    public ResponseEntity<Planets> findVenus() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_VENUS, Planets.class));
    }
    
    public ResponseEntity<Planets.Earth> findEarth() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_EARTH, Planets.Earth.class));
    }
    
    public ResponseEntity<Planets> findSaturn() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_SATURN, Planets.class));
    }
    
    public ResponseEntity<Planets> findUranus() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_URANUS, Planets.class));
    }
    
    public ResponseEntity<Planets> findNeptune() {
        return ResponseEntity.ok(restTemplate.getForObject(URL_NEPTUNE, Planets.class));
    }
}
