package com.hillel.lecture_10;

public class EngineerCalculator extends AbstractCalculator {
    @Override
    public void name() {
        System.out.println("It`s Engineer calculator");
    }

    public double sinus(double firstNumber){
        System.out.println("Sinus calculation");
        double result = Math.sin(firstNumber);
        return result;
    }

}
