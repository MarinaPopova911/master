package shape;

public class Parallelogram extends Rectangle {
    public Parallelogram(Double a, Double b) {
        super(a, b);
    }

    @Override
    public Double square() {
        return a * b;
    }
}