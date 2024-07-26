package org.example.entity;

public class Calculator {
    public static Double addition(Double a, Double b) {
        return a + b;
    }

    public static Double subtraction(Double a, Double b) {
        return a - b;
    }

    public static Double multiplication(Double a, Double b) {
        return a * b;
    }

    public static String division(Double a, Double b) {
        String result = new String();
        if (b != 0.0) {
            result = String.valueOf(a / b);
        } else {
            result = "You can't divide by zero!";
        }
        return result;
    }
}
