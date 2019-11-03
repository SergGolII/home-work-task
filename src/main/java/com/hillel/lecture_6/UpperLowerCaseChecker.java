package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        result += word.toUpperCase();
        return result;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        result += word.toLowerCase();
        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        sentence = sentence.toUpperCase().charAt(0) + sentence.substring(1);
        for (int i = 0; i < sentence.length() - 2; i++) {
            if (sentence.charAt(i) == '.') {
                sentence = sentence.substring(0, i + 2) + sentence.substring(i + 2, i + 3).toUpperCase() + sentence.substring(i + 3);
            }
        }
        return sentence;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        sentence = sentence.toUpperCase().charAt(0) + sentence.substring(1);
        for (int i = 0; i < sentence.length() - 1; i++) {
            if (sentence.charAt(i) == ' ') {
                sentence = sentence.substring(0, i + 1) + sentence.substring(i + 1, i + 2).toUpperCase() + sentence.substring(i + 2);
            }
        }
        return sentence;
    }
}
