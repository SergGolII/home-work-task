package com.hillel.lecture_10;

public class EarthPlanet extends AbstractPlanet {

    public void atmosphere() {
        System.out.println("Earth's atmosphere is 78% nitrogen, 21% oxygen, 1% argon and other gases");
    }

    @Override
    public void numberByDistance() {
        System.out.println("Earth is the third solar system planet from the Sun.");
    }
}
