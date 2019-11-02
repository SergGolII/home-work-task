package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter {

    @Step
    public double metersToInches(double meters) {
//        TODO implements result
        double result = 0.0;
        result = meters * 39.37;
        return result;
    }

    public double inchesToMeters(double inches) {
//        TODO implements result
        double result = 0.0;
        result = inches / 39.37;
        return result;
    }

    public double milesToKilometres(double miles) {
//        TODO implements result
        double result = 0.0;
        result = miles * 1.609;
        return result;
    }

    public double kilometresToMiles(double kilometres) {
//        TODO implements result
        double result = 0.0;
        result = kilometres / 1.609;
        return result;
    }
}
