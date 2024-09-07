package Equation;

public class Equation {
    public String equation(Integer a, Integer b, Integer c) {
        String roots;
        Double d;
        d = Math.pow(b, 2) - (4 * a * c);
        if (d < 0) {
            roots = "Корней нет";
        } else if (d == 0) {
            roots = String.valueOf((-b) / (2 * a));
        } else {
            roots = ((-b) + Math.sqrt(d)) / (2 * a) + ", " + ((-b) - Math.sqrt(d)) / (2 * a);
        }
        return roots;
    }
}
