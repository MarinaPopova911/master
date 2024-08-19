package org.example.factorypattern.fabric;

import org.example.factorypattern.product.ChocolateAirportProduct;
import org.example.factorypattern.product.FoodAirportProduct;

public class ChocolateFoodAirportFactory implements FoodAirportFactory {
    public FoodAirportProduct createProduct() {
        return new ChocolateAirportProduct();
    }
}
