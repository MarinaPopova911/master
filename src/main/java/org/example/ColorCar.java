package org.example;

public class ColorCar {
    public String typeCar;
    public ColorEnum color;

    public ColorCar(String typeCar, ColorEnum color) {
        this.typeCar = typeCar;
        this.color = color;
    }
    public ColorEnum getColorCar() {
        return color;
    }
}
