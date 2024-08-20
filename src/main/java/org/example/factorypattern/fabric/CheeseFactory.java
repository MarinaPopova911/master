package org.example.factorypattern.fabric;

import org.example.factorypattern.product.CheeseProduct;
import org.example.factorypattern.product.FoodProduct;

public class CheeseFactory implements FoodFactory {
    public FoodProduct createProduct() {
        return new CheeseProduct();
    }
}
