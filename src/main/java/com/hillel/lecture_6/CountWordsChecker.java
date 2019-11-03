package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker {

    @Step
    public int countNumberOfWorld(String sentence) {

//        TODO implements result
        int result = 0;
        sentence = sentence.trim();

        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) == ' ') && (sentence.charAt(i + 1) != ' ')) {
                result++;
            }

            if (i == sentence.length() - 1){
                result++;
            }
        }


        return result;
    }


}
