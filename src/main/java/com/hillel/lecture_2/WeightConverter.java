package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter {

    @Step
    public double kilogramsToPounds(double kilograms) {
//        TODO implements result
        double result = 0.0;
        result = kilograms * 2.2046;
        return result;
    }

    @Step
    public double poundsToKilograms(double pounds) {
//        TODO implements result
        double result = 0.0;
        result = pounds / 2.2046;
        return result;
    }

}
