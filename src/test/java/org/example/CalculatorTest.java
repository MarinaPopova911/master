package org.example;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @DataProvider(name = "valueCalculatorDataProvider")
    public static Object[][] initDataProvider() {
        return new Object[][]{
                {1.0, 2.0, 3.0},
                {5.0, 1.0, 6.0},
                {7.0, 2.0, 9.0}
        };
    }

    @Test(dataProvider = "valueCalculatorDataProvider")
    public void sumTestDataProvider(Double a, Double b, Double c) {
        Assert.assertEquals(calculator.sum(a, b), c);
    }

    @Test(description = "Деление двух чисел", expectedExceptions = AssertionError.class)
    public void divisionTest() {
        Assert.assertEquals(calculator.division(10.0, 0.0), 5.0);
    }

    @Test(description = "Деление двух чисел")
    public void divisionTest2() {
        try {
            Assert.assertEquals(calculator.division(10.0, 0.0), 5.0);
        } catch (AssertionError error) {
            Assert.fail("Деление на ноль");
        }
    }

    @Test(description = "Вычитание двух чисел")
    public void diffTest() {
        Assert.assertEquals(calculator.diff(14.0, 5.0), 9.0);
    }

    @Test(description = "Умножение двух чисел")
    public void multiplicationTest() {
        Assert.assertEquals(calculator.multiplication(10.0, 2.0), 20.0);
    }
}

