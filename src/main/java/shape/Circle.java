package shape;

public class Circle extends Shape {
    public Double r;

    public Circle(Double r) {
        this.r = r;
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(r, 2);
    }
}
