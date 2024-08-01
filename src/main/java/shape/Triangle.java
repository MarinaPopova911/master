package shape;

public class Triangle extends Shape {
    public Double a;
    public Double b;

    public Triangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double square() {
        return (a * b) / 2;
    }
}