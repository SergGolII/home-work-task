package com.hillel.lecture_4;

/**
 * Написать программу, которая выводит все символы (char) в промежутке от 135 до 255
 */
public class PrintCharTestTask {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++){
            System.out.println(Character.toString ((char) i));
        }
    }

}
