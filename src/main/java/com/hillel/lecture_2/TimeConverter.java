package com.hillel.lecture_2;

/**
 * Created by alpa on 10/17/19
 */
public class TimeConverter {

    public double secondsToDays(int seconds) {
//        TODO implements result
        int expectedResult = 0;
        // Математическое преобразование секунд в int типа 18234107,
        // где 18 - это дни, 23 - часы, 41 - минуты, 07 - секунды
        // Чтобы вернуть 4 переменных 1м int`ом
        int expectedResultDays = (int)Math.floor(seconds / 86400);
        int expectedResultHours = (int)Math.floor((seconds / 3600) - (expectedResultDays * 24));
        int expectedResultMinutes = (int)Math.floor((seconds / 60) - (expectedResultDays * 24 * 60) - (expectedResultHours * 60));
        int expectedResultSeconds = (int)Math.floor(seconds - (expectedResultDays * 24 * 3600) - (expectedResultHours * 3600) - (expectedResultMinutes * 60));
        expectedResult = expectedResultSeconds + (expectedResultMinutes * 100) + (expectedResultHours * 10000) + (expectedResultDays * 1000000);
        return expectedResult;
    }

    public double daysToSeconds(int days) {
//        TODO implements result
        int result = 0;
        int expectedResultDays = (int)(Math.floor(days / 1000000));
        int expectedResultHours = (int)(Math.floor((days - expectedResultDays*1000000)/ 10000));
        int expectedResultMinutes = (int)(Math.floor((days - expectedResultDays*1000000 - expectedResultHours*10000)/ 100));
        int expectedResultSeconds = (int)(Math.floor((days - expectedResultDays*1000000 - expectedResultHours*10000 - expectedResultMinutes*100)));
        result = expectedResultDays * 86400 + expectedResultHours * 3600 + expectedResultMinutes * 60 + expectedResultSeconds;
        return result;
    }
}
