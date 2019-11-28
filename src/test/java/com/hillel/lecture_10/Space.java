package com.hillel.lecture_10;

public class Space {
    public static void main(String[] args) {

        AndromedaGalaxy andromedaGalaxy = new AndromedaGalaxy();
        andromedaGalaxy.move();
        andromedaGalaxy.apocalips();

        SolarPlanetSystem solarPlanetSystem = new SolarPlanetSystem();
        solarPlanetSystem.planetQuantity();
        solarPlanetSystem.presenceOfLife();

        SolarStar solarStar = new SolarStar();
        solarStar.luminosity();
        solarStar.radiation();

        EarthPlanet earthPlanet = new EarthPlanet();
        earthPlanet.atmosphere();
        earthPlanet.numberByDistance();

    }
}
