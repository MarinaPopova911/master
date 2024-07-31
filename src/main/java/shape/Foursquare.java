package shape;

public class Foursquare extends Shape {

    public Foursquare(Double a, Double b) {
        super(a, b);
    }

    public Double square() {
        return Math.pow(a, 2);
    }
}