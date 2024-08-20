package org.example;

import org.example.factorypattern.fabric.FoodFactory;

public class Person {
    public String namePerson;
    public FoodFactory preferredFood;
    public Person (String namePerson, FoodFactory preferredFood) {
        this.namePerson = namePerson;
        this.preferredFood = preferredFood;
    }
}
