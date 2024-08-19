package org.example.factorypattern.fabric;

import org.example.factorypattern.product.FoodAirportProduct;
import org.example.factorypattern.product.SausageAirportProduct;

public class SausageFoodAirportFactory implements FoodAirportFactory {
    public FoodAirportProduct createProduct() {
        return new SausageAirportProduct();
    }
}
