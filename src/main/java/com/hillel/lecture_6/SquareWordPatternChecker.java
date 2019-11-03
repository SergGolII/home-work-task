package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {

//        TODO implements result
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (i != word.length() - 1) {
                result = result + word + ", ";
            } else {
                result = result + word;
            }
            word += word.charAt(0);
            word = word.substring(1);
        }

        return result;
    }


}
