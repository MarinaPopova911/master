package org.example.factorypattern.product;

public class ChocolateProduct implements FoodProduct {
    public String getName() {
        return "Шоколад";
    }

    public Double getPrice() {
        return 200.00;
    }
}
