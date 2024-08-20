package org.example.factorypattern.fabric;

import org.example.factorypattern.product.FoodProduct;

public interface FoodFactory {
    FoodProduct createProduct();
}
