package shape;

public class Rectangle extends Foursquare {
    public Rectangle(Double a, Double b) {
        super(a, b);
    }

    @Override
    public Double square() {
        return a * b;
    }
}