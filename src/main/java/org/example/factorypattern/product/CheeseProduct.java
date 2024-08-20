package org.example.factorypattern.product;

public class CheeseProduct implements FoodProduct {
    public String getName() {
        return "Сыр";
    }

    public Double getPrice() {
        return 130.50;
    }
}
