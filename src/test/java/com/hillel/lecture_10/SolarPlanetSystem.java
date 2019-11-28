package com.hillel.lecture_10;

public class SolarPlanetSystem extends AbstractPlanetSystem{

    public void presenceOfLife() {
        System.out.println("The only known planetary system with life");
    }

    @Override
    public void planetQuantity() {
        System.out.println("Solar system contains 8 planets");
    }
}
