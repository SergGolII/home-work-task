package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "";
        double discrim = b*b - 4*a*c;
        if (a == 0) {
            result = "x = " + (-c/b);
        } else if (discrim > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(discrim)) / (2 * a);
            x2 = (-b - Math.sqrt(discrim)) / (2 * a);
            result = "Discriminant: " + discrim + ", x1: " + x1 + ", x2: " + x2;
        } else if (discrim == 0) {
            double x3 = -b / (2 * a);
            result = "Two real, identical roots: [x1 && x2] = " + x3;
        } else {
            result = "No roots on the set of real numbers!";
        }

        return result;
    }

}
