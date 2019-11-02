package com.hillel.lecture_4;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        System.out.println("x, grad | sin(x)");
        for (int i = 0; i <= 360 ; i+=10) {
            System.out.println("--------------------------");
            System.out.println(i + " | " + Math.sin(i));
        }
    }

}
