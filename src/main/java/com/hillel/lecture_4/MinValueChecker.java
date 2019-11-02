package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class MinValueChecker {

    @Step
    public int getValue(int[] values) {

//        TODO implements result
        int result = values[0];
        int i = 1;
        while (i<values.length){
            if (values[i]<result){
                result = values[i];
            }
            i++;
        }
        return result;
    }

}
