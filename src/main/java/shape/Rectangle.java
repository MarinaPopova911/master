package shape;

public class Rectangle extends Foursquare {
    public Double b;

    public Rectangle(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }

    @Override
    public Double square() {
        return a * b;
    }
}