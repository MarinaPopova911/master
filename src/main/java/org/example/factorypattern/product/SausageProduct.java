package org.example.factorypattern.product;

public class SausageProduct implements FoodProduct {
    public String getName() {
        return "Колбаса";
    }

    public Double getPrice() {
        return 250.00;
    }
}
