package Calculator;

public class Calculator {
    Double c;

    public Double sum(Double a, Double b) {
        c = a + b;
        return c;
    }

    public Double diff(Double a, Double b) {
        c = a - b;
        return c;
    }

    public Double multiplication(Double a, Double b) {
        c = a * b;
        return c;
    }

    public Double division(Double a, Double b) {
        c = a / b;
        return c;
    }
}