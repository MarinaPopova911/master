package shape;

public class Foursquare extends Shape {
    public Double a;
    public Double b;

    public Foursquare(Double a) {
        this.a = a;
    }

    public Foursquare(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Foursquare() {
    }

    public Double square() {
        return Math.pow(a, 2);
    }
}