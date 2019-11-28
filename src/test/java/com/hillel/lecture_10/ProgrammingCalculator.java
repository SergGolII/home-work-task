package com.hillel.lecture_10;

public class ProgrammingCalculator extends AbstractCalculator {
    @Override
    public void name() {
        System.out.println("It`s Programming calculator");
    }

    public void comparison(double firstNumber, double secondNumber){
        System.out.println("Сomparison of two numbers");
        if (firstNumber == secondNumber) {
            System.out.println("First numbers = " + firstNumber + " and second number = " + secondNumber + " are equel");
        } else if  (firstNumber < secondNumber){
            System.out.println("First numbers = " + firstNumber + " are less then second number = " + secondNumber);
        } else {
            System.out.println("First numbers = " + firstNumber + " is greater then second number = " + secondNumber);
        }
    }

}
