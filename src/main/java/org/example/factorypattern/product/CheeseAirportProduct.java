package org.example.factorypattern.product;

public class CheeseAirportProduct implements FoodAirportProduct {
    public String getName() {
        return "молоко, закваска, соль, фермент";
    }

    public Double getPrice() {
        return 130.50;
    }
}
