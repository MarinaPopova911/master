package org.example;

import Equation.Equation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EquationTest {
    Equation equation = new Equation();

    @DataProvider(name = "valueCalculatorDataProvider")
    public static Object[][] initDataProvider() {
        return new Object[][]{
                {1, -4, -5, "5.0, -1.0"},
                {1, -2, 1, "1"},
                {1, -5, 4, "4.0, 1.0"},
                {1, -7, 12, "4.0, 3.0"}
        };
    }

    @Test(dataProvider = "valueCalculatorDataProvider")
    public void equationTestDataProvider(Integer a, Integer b, Integer c, String res) {
        Assert.assertEquals(equation.equation(a, b, c), res);
    }
}
