package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;

        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String[] parts = code.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String inLetterDigit = "";

        for (int i = 0; i < part1.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (part1.charAt(i) == digits[j]){
                    inLetterDigit += digits[j];
                }
            }
        }
        int digitas = Integer.parseInt(inLetterDigit);
        int sum = digitas%100 * ((digitas/100)%100) * ((digitas/10000)%100);
        if (sum == Integer.parseInt(part2) && part1.equals(part1.toUpperCase())){
            isValid = true;
        }

        return isValid;
    }
}
