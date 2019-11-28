package com.hillel.lecture_10;

public class Calculator {
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.name();
        System.out.println(simpleCalculator.plus(12d, 22d));
        System.out.println(simpleCalculator.minus(23d, 11d));
        System.out.println(simpleCalculator.multiplication(23d, 11d));
        System.out.println(simpleCalculator.division(33d, 11d));

        FinanceCalculator financeCalculator = new FinanceCalculator();
        financeCalculator.name();
        System.out.println(financeCalculator.percent(120d, 10d));

        AccountingCalculator accountingCalculator = new AccountingCalculator();
        accountingCalculator.name();
        System.out.println(accountingCalculator.profit(100d, 80d) + "%");

        EngineerCalculator engineerCalculator = new EngineerCalculator();
        engineerCalculator.name();
        System.out.println(engineerCalculator.sinus(30));

        ProgrammingCalculator programmingCalculator = new ProgrammingCalculator();
        programmingCalculator.name();
        programmingCalculator.comparison(30, 15);

    }
}
