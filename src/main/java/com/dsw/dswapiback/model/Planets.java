package com.dsw.dswapiback.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planets {
    
    private String     id;
    private String     name;
    private String     englishName;
    private Boolean    isPlanet;
    private int        moons;
    private Long       semimajorAxis;
    private Long       perihelion;
    private Long       aphelion;
    private Float      eccentricity;
    private Float      inclination;
//    private List<Mass> massValue;
//    private List<Mass> massExponent;
//    private List<Vol>  volValue;
//    private List<Vol>  volExponent;
    private Float      density;
    private Float      gravity;
    private Float      escape;
    private Float      meanRadius;
    private Float      equaRadius;
    private Float      polarRadius;
    private int        flattening;
    private String     dimension;
    private Float      sideralOrbit;
    private Float      sideralRotation;
    private int    aroundPlanet;
    private String discoveredBy;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date   discoveryDate;
    private String alternativeName;
    private Float  axialTilt;
    private int    avgTemp;
    private Float  mainAnomaly;
    private Float  argPeriapsis;
    private Float  longAscNode;
    private String bodyType;
    
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Earth {
    
        private String     id;
        private String     name;
        private String     englishName;
        private Boolean    isPlanet;
        //private int[]        moons;
        private Long       semimajorAxis;
        private Long       perihelion;
        private Long       aphelion;
        private Float      eccentricity;
        private Float      inclination;
        //    private List<Mass> massValue;
//    private List<Mass> massExponent;
//    private List<Vol>  volValue;
//    private List<Vol>  volExponent;
        private Float      density;
        private Float      gravity;
        private Float      escape;
        private Float      meanRadius;
        private Float      equaRadius;
        private Float      polarRadius;
        private int        flattening;
        private String     dimension;
        private Float      sideralOrbit;
        private Float      sideralRotation;
        private int    aroundPlanet;
        private String discoveredBy;
        @JsonFormat(pattern = "dd/MM/yyyy")
        private Date   discoveryDate;
        private String alternativeName;
        private Float  axialTilt;
        private int    avgTemp;
        private Float  mainAnomaly;
        private Float  argPeriapsis;
        private Float  longAscNode;
        private String bodyType;
    }
    
    
}

