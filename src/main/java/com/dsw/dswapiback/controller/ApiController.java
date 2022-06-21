package com.dsw.dswapiback.controller;

import com.dsw.dswapiback.model.Planets;
import com.dsw.dswapiback.service.PlanetsService;
import com.dsw.dswapiback.service.SolarSystemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping ("/solarSystem")
public class ApiController {
    
    private final PlanetsService planetsService;
    private final SolarSystemService solarSystemService;

    public ApiController(PlanetsService planetsService, SolarSystemService solarSystemService) {
        this.planetsService = planetsService;
        this.solarSystemService = solarSystemService;
    }

    
    @GetMapping
    public ResponseEntity<Object> getAll() {
        return solarSystemService.findAllList();
    }
    
    
    @GetMapping ("/planets/jupiter")
    public ResponseEntity<Planets> getJupiter() {
        return planetsService.findJupiter();
    }
    
    @GetMapping ("/planets/mars")
    public ResponseEntity<Planets> getMars() {
        return planetsService.findMars();
    }
    
    @GetMapping ("/planets/mercury")
    public ResponseEntity<Planets> getMercury() {
        return planetsService.findMercury();
    }
    
    @GetMapping ("/planets/venus")
    public ResponseEntity<Planets> getVenus() {
        return planetsService.findVenus();
    }
    
    @GetMapping ("/planets/earth")
    public ResponseEntity<Planets.Earth> getEarth() {
        return planetsService.findEarth();
    }
    
    @GetMapping ("/planets/saturn")
    public ResponseEntity<Planets.Saturn> getSaturn() {
        return planetsService.findSaturn();
    }
    
    @GetMapping ("/planets/uranus")
    public ResponseEntity<Planets> getUranus() {
        return planetsService.findUranus();
    }
    
    @GetMapping ("/planets/neptune")
    public ResponseEntity<Planets> getNeptune() {
        return planetsService.findNeptune();
    }
}
    

