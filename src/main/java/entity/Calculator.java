package entity;

public class Calculator {

    public <T extends Number> Double addition(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public <T extends Number> Double subtraction(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    public <T extends Number> Double multiplication(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }
}