package shape;

public class Parallelogram extends Rectangle {
    public Double a;
    public Double b;

    public Parallelogram(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Double square() {
        return a * b;
    }
}