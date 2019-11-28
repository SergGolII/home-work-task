package com.hillel.lecture_10;

public class SolarStar extends AbstractStar{

    public void radiation() {
        System.out.println("Solar radiation supports life on Earth (light is necessary for the initial stages of photosynthesis), determines the climate.");
    }

    @Override
    public void luminosity() {
        System.out.println("Luminosity of the Sun is 3.827⋅1026 W or 3.827⋅1033 erg/s");
    }
}
