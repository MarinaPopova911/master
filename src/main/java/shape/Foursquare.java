package shape;

public class Foursquare extends Shape {
    public Double a;

    public Foursquare(Double a) {
        this.a = a;
    }

    public Foursquare() {
    }

    public Double square() {
        return Math.pow(a, 2);
    }
}