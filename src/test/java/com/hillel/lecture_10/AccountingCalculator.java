package com.hillel.lecture_10;

public class AccountingCalculator extends AbstractCalculator{
    @Override
    public void name() {
        System.out.println("It`s Accounting calculator");
    }

    public double profit(double firstNumber, double secondNumber){
        System.out.println("Percent profit calculation");
        double result = (firstNumber - secondNumber)/firstNumber*100;
        return result;
    }

}
