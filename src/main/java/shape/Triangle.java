package shape;

public class Triangle extends Shape {
    public Double a;
    public Double h;

    public Triangle(Double a, Double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public Double square() {
        return (a * h) / 2;
    }
}