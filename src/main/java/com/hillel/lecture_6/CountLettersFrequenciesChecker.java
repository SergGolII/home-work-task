package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountLettersFrequenciesChecker {


    @Step
    public String countLettersFrequencies(String text, char letter) {

//        TODO implements result
        String result = "";
        char[] textCharArray = text.toCharArray();
        int counter = 0;

        for (int i = 0; i < textCharArray.length; i++) {
            if (textCharArray[i] == letter){
                counter++;
            }
            result = "Character '" + letter + "' repeated " + counter + " times";
        }

        return result;
    }
}
