package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {

//        TODO implements result
        String result = "";
        char a;
        char[] temp = value.toCharArray();
        for (int i = 0; i < value.length(); i++) {
            result += String.valueOf(temp[value.length()-1-i]);
      }
        return result;
    }

}
