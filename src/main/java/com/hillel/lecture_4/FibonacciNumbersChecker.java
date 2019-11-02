package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class FibonacciNumbersChecker {

    @Step
    public int[] getFibonacciNumbers(int number) {

//        TODO implements result
        int[] result;
        result = new int[number];
        int i=2;
        result[0] = 0;
        result[1] = 1;
        number -= 2;
        while (number > 0){
            result [i] = result [i-1] + result [i-2];
            i++;
            number -= 1;
        }
        return result;
    }

}
