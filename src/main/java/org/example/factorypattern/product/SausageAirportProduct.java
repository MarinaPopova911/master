package org.example.factorypattern.product;

public class SausageAirportProduct implements FoodAirportProduct{
    public String getName() {
        return "мясо, специи, яйца, молоко";
    }

    public Double getPrice() {
        return 250.00;
    }
}
