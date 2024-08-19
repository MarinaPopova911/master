package org.example.factorypattern.fabric;

import org.example.factorypattern.product.FoodAirportProduct;

public interface FoodAirportFactory {
    FoodAirportProduct createProduct();
}
