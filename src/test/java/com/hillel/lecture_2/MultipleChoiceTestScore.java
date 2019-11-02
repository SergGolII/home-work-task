package com.hillel.lecture_2;

import java.util.Scanner;

public class MultipleChoiceTestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите общее количество тестов:");
        int totalTest = sc.nextInt();

        System.out.println("Введите количество пройденный успешно тестов:");
        int passedTest = sc.nextInt();

        System.out.println("Пройдено успешно " + 100*passedTest/totalTest + "% тестов");
        System.out.println("Пройдено с ошибкой " + (100 - 100*passedTest/totalTest) + "% тестов");
    }
}

