package org.example.factorypattern.fabric;

import org.example.factorypattern.product.ChocolateProduct;
import org.example.factorypattern.product.FoodProduct;

public class ChocolateFactory implements FoodFactory {
    public FoodProduct createProduct() {
        return new ChocolateProduct();
    }
}
