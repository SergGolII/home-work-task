package com.hillel.lecture_2;

import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LifeTime {
    public static void main(String[] args) {
//Не смог запихнуть в Java только решение
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
            LocalDate today = LocalDate.now();
            LocalDate birthday = LocalDate.parse("1/1/1960", formatter);


            Period p = Period.between(birthday, today);
            System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                    " months and " + p.getDays() +
                    " days old.");

    }
}