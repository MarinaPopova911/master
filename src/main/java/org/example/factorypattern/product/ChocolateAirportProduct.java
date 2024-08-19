package org.example.factorypattern.product;

public class ChocolateAirportProduct implements FoodAirportProduct {
    public String getName() {
        return "какао, сахар, масло, молоко";
    }

    public Double getPrice() {
        return 200.00;
    }
}
