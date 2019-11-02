package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = true;

        char[] temp = value.toCharArray();
        int i = 0;
        while (i < temp.length / 2){
            if (temp[i] != temp[temp.length - 1 - i]){
                result = false;
            }
            i++;
        }

        return result;
    }

}
