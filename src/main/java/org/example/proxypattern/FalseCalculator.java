package org.example.proxypattern;

public class FalseCalculator implements CalculatorInterface {
    Double c;

    public Double sum(Double a, Double b) {
        c = a + b + 0.01;
        return c;
    }

    public Double diff(Double a, Double b) {
        c = a - b - 0.01;
        return c;
    }

    public Double multiplication(Double a, Double b) {
        c = a * b - 0.01;
        return c;
    }

    public Double division(Double a, Double b) {
        c = (a / b) + 0.01;
        return c;
    }
}