package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

//        TODO implements result
        int result = 0;
        int x = 1;
        while (value != 0){
            result = result + value%2 * x;
            x = x*10;
            value = value/2;
            }

        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

//        TODO implements result
        int result = 0;
        int i = 0;
        while (value != 0){
            result = result + value%10 * (int)Math.pow(2, i);
            i++;
            value = value / 10;
        }

        return result;
    }
}
