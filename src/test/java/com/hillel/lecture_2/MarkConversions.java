package com.hillel.lecture_2;

import java.util.Scanner;

public class MarkConversions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите общее количество тестов:");
        int totalTest = sc.nextInt();

        System.out.println("Введите количество отмеченных тестов:");
        int markedTest = sc.nextInt();

        System.out.println("Отмечено " + 100*markedTest/totalTest + "% тестов");
    }
}
