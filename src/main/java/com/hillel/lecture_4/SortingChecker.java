package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        for(int i = values.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( values[j] > values[j+1] ){
                int tmp = values[j];
                values[j] = values[j+1];
                values[j+1] = tmp;
            }
        }
    }
        return values;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result

        for(int i = values.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( values[j] < values[j+1] ){
                    int tmp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = tmp;
                }
            }
        }
        return values;
    }
}
