package shape;

public class Circle extends Shape {
    public Double a;

    public Circle(Double a) {
        this.a = a;
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(a, 2);
    }
}
