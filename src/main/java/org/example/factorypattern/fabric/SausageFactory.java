package org.example.factorypattern.fabric;

import org.example.factorypattern.product.FoodProduct;
import org.example.factorypattern.product.SausageProduct;

public class SausageFactory implements FoodFactory {
    public FoodProduct createProduct() {
        return new SausageProduct();
    }
}
