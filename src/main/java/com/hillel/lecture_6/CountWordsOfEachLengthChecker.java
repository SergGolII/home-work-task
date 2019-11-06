package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;
        int counter = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ' && sentence.charAt(i) != '.' && sentence.charAt(i) != ',') {
                counter++;
            } else if (counter == wordLength){
                result++;
                counter = 0;
            } else {
                counter = 0;
            }
            if ((i == sentence.length() - 1) && (counter == wordLength)){
                result++;
            }
        }

        return result;
    }


}
