package org.example;

import org.example.factorypattern.fabric.FoodAirportFactory;

public class Person {
    public String namePerson;
    public FoodAirportFactory preferredFood;
    public Person (String namePerson, FoodAirportFactory preferredFood) {
        this.namePerson = namePerson;
        this.preferredFood = preferredFood;
    }
}
