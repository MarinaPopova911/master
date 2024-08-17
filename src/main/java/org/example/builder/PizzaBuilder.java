package org.example.builder;

public class PizzaBuilder {
    private final Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder withDough(String dough) {
        pizza.dough = dough;
        return this;
    }

    public PizzaBuilder withCheese(String cheese) {
        pizza.cheese = cheese;
        return this;
    }

    public PizzaBuilder withSouce(String souce) {
        pizza.souce = souce;
        return this;
    }
    public PizzaBuilder withSausage(String sausage) {
        pizza.sausage = sausage;
        return this;
    }

    public PizzaBuilder withGreens(String greens) {
        pizza.greens = greens;
        return this;
    }

    public PizzaBuilder withTomatoes(String tomatoes) {
        pizza.tomatoes = tomatoes;
        return this;
    }
    public PizzaBuilder withMushrooms(String mushrooms) {
        pizza.mushrooms = mushrooms;
        return this;
    }

    public PizzaBuilder withPineapple(String pineapple) {
        pizza.pineapple = pineapple;
        return this;
    }

    public PizzaBuilder withChicken(String chicken) {
        pizza.chicken = chicken;
        return this;
    }

    public Pizza build() {
        if (pizza.dough == null) {
            throw new RuntimeException("Не указан тип теста");
        }
        if (pizza.cheese == null) {
            throw new RuntimeException("Не указан вид сыра");
        }
        if (pizza.souce == null) {
            throw new RuntimeException("Не указан вид соуса");
        }
        return pizza;
    }
}
