package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

//        TODO implements result
        String result = "";

        char[] hexDigits = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        int temp = 0;

        while (value != 0){
            if (value <=16) {
                result += hexDigits[value];
            } else {
                result += hexDigits[value%16];
            }
            value = value/16;
        }

        result = inPlaceReverse(result);
        return result;
    }

    //Reverse method
    public static String inPlaceReverse(final String input)
    {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++)
        {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }
        return builder.toString();
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

//        TODO implements result
        String hexDigits = "0123456789ABCDEF";
        int result = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            int hexhDigit = hexDigits.indexOf(c);
            result = 16 * result + hexhDigit;
        }
        return result;
    }
}
