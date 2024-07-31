package shape;

public class Shape {
    public Double a, b;

    public Shape(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Shape(Double a) {
        this.a = a;
    }

    public Double square() {
        return a * b;
    }
}