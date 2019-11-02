package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public double linearEquation(int a, int b) {

//        TODO implements result
        double result = 0.0;
        if (a == 0) {
            System.out.println("Если переменная а равна 0, значит b тоже равна 0, а х неисчислим");
        } else if (b == 0) {
            System.out.println("Если переменная b равна 0 и а не равна 0, значит х равен 0");
        } else {
            result = -b / a;
        }
        return result;
    }
}
