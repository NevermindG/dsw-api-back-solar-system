# dsw-api-back-solar-system :sunny::space_invader:
---
This service is about the solar system, specifically the planets have been emphasized,
although we can also see the entire solar system. ***The Solar System*** is the creator of the APIs that are being consumed in this project.

___

## Endpoints
```yaml
/solarSystem
/solarSystem/planets/mercury
/solarSystem/planets/venus
/solarSystem/planets/earth
/solarSystem/planets/mars
/solarSystem/planets/jupiter
/solarSystem/planets/saturn
/solarSystem/planets/uranus
/solarSystem/planets/neptune
```

## Examples
 * /solarSystem
```JSON
{
  "bodies": [
    {
      "id": "lune",
      "name": "La Lune",
      "englishName": "Moon",
      "isPlanet": false,
      "moons": null,
      "semimajorAxis": 384400,
      "perihelion": 363300,
      "aphelion": 405500,
      "eccentricity": 0.05490,
      "inclination": 5.14500,
      "mass": {
        "massValue": 7.34600,
        "massExponent": 22
      },
      "vol": {
        "volValue": 2.19680,
        "volExponent": 10
      },
      "density": 3.34400,
      "gravity": 1.62000,
      "escape": 2380.00000,
      "meanRadius": 1737.00000,
      "equaRadius": 1738.10000,
      "polarRadius": 1736.00000,
      "flattening": 0.00120,
      "dimension": "",
      "sideralOrbit": 27.32170,
      "sideralRotation": 655.72800,
      "aroundPlanet": {
        "planet": "terre",
        "rel": "https://api.le-systeme-solaire.net/rest/bodies/terre"
      },
      "discoveredBy": "",
      "discoveryDate": "",
      "alternativeName": "",
      "axialTilt": 6.68,
      "avgTemp": 0,
      "mainAnomaly": 0.00000,
      "argPeriapsis": 0.00000,
      "longAscNode": 0.00000,
      "bodyType": "Moon",
      "rel": "https://api.le-systeme-solaire.net/rest/bodies/lune"
    }
   ]
}
```
* /solarSystem/planets/mercury
```JSON
{
  "id": "mercure",
  "name": "Mercure",
  "englishName": "Mercury",
  "isPlanet": true,
  "moons": null,
  "semimajorAxis": 57909050,
  "perihelion": 46001200,
  "aphelion": 69816900,
  "eccentricity": 0.20560,
  "inclination": 7.00000,
  "density": 5.42910,
  "gravity": 3.70000,
  "escape": 4250.00000,
  "meanRadius": 2439.40000,
  "equaRadius": 2440.53000,
  "polarRadius": 2439.70000,
  "flattening": 0,
  "dimension": "",
  "sideralOrbit": 87.96900,
  "sideralRotation": 1407.60000,
  "aroundPlanet": null,
  "discoveredBy": "",
  "discoveryDate": "",
  "alternativeName": "",
  "axialTilt": 0.0352,
  "avgTemp": 440,
  "mainAnomaly": 174.79600,
  "argPeriapsis": 29.02200,
  "longAscNode": 48.37800,
  "bodyType": "Planet"
}
```
