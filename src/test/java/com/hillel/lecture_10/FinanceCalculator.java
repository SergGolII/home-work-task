package com.hillel.lecture_10;

public class FinanceCalculator extends AbstractCalculator{

    @Override
    public void name() {
        System.out.println("It`s Finance calculator");
    }

    public double percent(double firstNumber, double secondNumber){
        System.out.println("Calculation of percent of the number");
        double result = firstNumber * secondNumber / 100;
        return result;
    }

}
