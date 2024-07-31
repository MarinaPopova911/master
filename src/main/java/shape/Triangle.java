package shape;

public class Triangle extends Shape {
    public Triangle(Double a, Double b) {
        super(a, b);
    }

    @Override
    public Double square() {
        return (a * b) / 2;
    }
}