package org.example;

import shape.*;

/**
 * Shapes
 */
public class App {
    public static void main(String[] args) {
        Shape[] shapes = {new Foursquare(2.0, 2.0),
                new Rectangle(2.0, 5.0),
                new Triangle(2.5, 3.9),
                new Parallelogram(2.0, 5.0),
                new Circle(2.0)};
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i].square());
        }
    }
}