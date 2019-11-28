package com.hillel.lecture_10;

public abstract class AbstractCalculator {

    private double firstNumber = 0d;
    private double secondNumber = 0d;

    public AbstractCalculator(){ }

    public AbstractCalculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public abstract void name();

    public double plus(double firstNumber, double secondNumber){
        double result = firstNumber + secondNumber;
        return result;
    }

    public double plus(){
        double result = firstNumber + secondNumber;
        return result;
    }


    public double minus(double firstNumber, double secondNumber){
        double result = firstNumber - secondNumber;
        return result;
    }

    public double minus(){
        double result = firstNumber - secondNumber;
        return result;
    }


    public double multiplication(double firstNumber, double secondNumber){
        double result = firstNumber * secondNumber;
        return result;
    }

    public double multiplication(){
        double result = firstNumber * secondNumber;
        return result;
    }


    public double division(double firstNumber, double secondNumber){
        double result = 0;
        if (secondNumber == 0){
            System.out.println("A test where the first number "+firstNumber+" is divided by the second number "+secondNumber+" is incorrect, since division by zero occurs!");
        } else {
            result = firstNumber / secondNumber;
        }
        return result;
    }

    public double division(){
        double result = 0;
        if (secondNumber == 0){
            System.out.println("A test where the first number "+firstNumber+" is divided by the second number "+secondNumber+" is incorrect, since division by zero occurs!");
        } else {
            result = firstNumber / secondNumber;
        }
        return result;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "Our numbers is " +
                "First = " + firstNumber +
                ", Second = " + secondNumber;
    }

}
