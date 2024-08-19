package org.example.factorypattern.fabric;

import org.example.factorypattern.product.CheeseAirportProduct;
import org.example.factorypattern.product.FoodAirportProduct;

public class CheeseFoodAirportFactory implements FoodAirportFactory {
    public FoodAirportProduct createProduct() {
        return new CheeseAirportProduct();
    }
}
