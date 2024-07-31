package shape;

public class Circle extends Shape {
    public Circle(Double a) {
        super(a);
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(a, 2);
    }
}
