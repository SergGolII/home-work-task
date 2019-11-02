package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */

    public class DivisorChecker {
        // disior <-> NUMBER

    @Step
        public String checkDivisor(int number, int divisor) {
            //        TODO implements result
            String result = "";
            result = (divisor % number == 0) ?
                    ("The number " + number + " is divisor of the number " + divisor) :
                    ("The number " + number + " is not divisor of the number " + divisor);

            return result;
        }
    }