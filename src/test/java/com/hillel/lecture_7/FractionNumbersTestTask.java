package com.hillel.lecture_7;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.assertEquals;
/**
 * Write class to represent FractionNumbers
 * This class should contain two fields.
 * This class should contain methods to perform basic math operations:
 * plus, minus, multiply, divide
 * Also, this class should have toString method to print numbers into standard output
 * Add tests for check functionality of FractionNumber class
 */
public class FractionNumbersTestTask {

    private FractionNumber fractionNumber = new FractionNumber();
    private FractionNumber fractionNumberWithParam = new FractionNumber(75.0d, 50.0d);

    @Test (dataProvider = "numbersProviderPlus")
    public void plusTest(double firstNumber, double secondNumber, double expectedResult) {
        assertEquals(fractionNumber.plus(firstNumber, secondNumber), expectedResult);
    }

    @DataProvider(name = "numbersProviderPlus")
    public static Object[][] numbersProviderPlus() {
        return new Object[][] {
                { 20.0d, 10.0d, 30.0d},
                { 50.0d, -30.0d, 20.0d},
                { 25.0d, 0.0d, 25.0d},
                { 0.0d, -30.0d, -30.0d}
        };
    }

    @Test (dataProvider = "numbersProviderMinus")
    public void minusTest(double firstNumber, double secondNumber, double expectedResult) {
        assertEquals(fractionNumber.minus(firstNumber, secondNumber), expectedResult);
    }

    @DataProvider(name = "numbersProviderMinus")
    public static Object[][] numbersProviderMinus() {
        return new Object[][] {
                { 20.0d, 10.0d, 10.0d},
                { 50.0d, -30.0d, 80.0d},
                { 25.0d, 0.0d, 25.0d},
                { 0.0d, -30.0d, 30.0d}
        };
    }

    @Test (dataProvider = "numbersProviderMultiplication")
    public void multiplicationTest(double firstNumber, double secondNumber, double expectedResult) {
        assertEquals(fractionNumber.multiplication(firstNumber, secondNumber), expectedResult);
    }

    @DataProvider(name = "numbersProviderMultiplication")
    public static Object[][] numbersProviderMultiplication() {
        return new Object[][] {
                { 20.0d, 10.0d, 200.0d},
                { 50.0d, -30.0d, -1500.0d},
                { 25.0d, 0.0d, 0.0d},
                { 0.0d, -30.0d, -0.0d}
        };
    }

    @Test (dataProvider = "numbersProviderDivision")
    public void divisionTest(double firstNumber, double secondNumber, double expectedResult) {
        assertEquals(fractionNumber.division(firstNumber, secondNumber), expectedResult);
    }

    @DataProvider(name = "numbersProviderDivision")
    public static Object[][] numbersProviderDivision() {
        return new Object[][] {
                { 20.0d, 10.0d, 2.0d},
                { 50.0d, -25.0d, -2.0d},
                { 25.0d, 0.0d, 0.0d},
                { 0.0d, -30.0d, -0.0d}
        };
    }

    @Test
    public void withParamPlus() {
        double expectedPlus = 125.0d;
        assertEquals(fractionNumberWithParam.plus(), expectedPlus);
    }

    @Test
    public void withParamMinus() {
        double expectedMinus = 25.0d;
        assertEquals(fractionNumberWithParam.minus(), expectedMinus);
    }

    @Test
    public void withParamMultiplication() {
        double expectedMultiplication = 3750.0d;
        assertEquals(fractionNumberWithParam.multiplication(), expectedMultiplication);
    }

    @Test
    public void withParamDivision() {
        double expectedDivision = 1.5d;
        assertEquals(fractionNumberWithParam.division(), expectedDivision);
    }

}

