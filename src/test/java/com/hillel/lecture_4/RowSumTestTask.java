package com.hillel.lecture_4;

/**
 * Написать программу, которая считает сумму двух колонок. Если
 * одна из колонок больше, вывести, какая именно больше. Если
 * колонки одинаковы - вывести результат в виде:
 * | row_1 | row_2 | sum |
 * | 2 | 5 | 7 |
 */
public class RowSumTestTask {
    public static void main(String[] args) {
        int[] row1 = {1, 2, 3, 4, 5, 7};
        int[] row2 = {3, 2, 5, 7, 8, 8};
        if (row1.length > row2.length) {
            System.out.println("Column row1 is bigger");
        } else if (row1.length < row2.length) {
            System.out.println("Column row2 is bigger");
        } else {
            System.out.println("| row_1 | row_2 | sum |");
            int lenght = (row1.length > row2.length) ? row1.length : row2.length;
//        int[] sum = new int[lenght];
            for (int i = 0; i < lenght; i++) {
                System.out.println("| " + row1[i] + " | " + row2[i] + " | " + (row1[i] + row2[i]) + " |");


            }
        }
    }
}