package org.example;

import org.example.builder.Pizza;
import org.example.builder.PizzaBuilder;
import org.example.prototype.Cat;
import org.example.prototype.PinkCat;
import org.example.prototype.WhiteCat;
import org.example.singleton.AppConnection;
import org.example.singleton.AppSingletone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Singleton & Builder pattern's
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        AppConnection appConnection = AppSingletone.getInstant();
        AppConnection appConnection2 = AppSingletone.getInstant();
        appConnection.appCompleted();
        appConnection2.appCompleted();

        Pizza pizza =
                new PizzaBuilder()
                        .withDough("Тонкое")
                        .withChicken("да")
                        .withCheese("Пармезан")
                        .withSouce("Кетчуп")
                        .build();
        Pizza pizza2 =
                new PizzaBuilder()
                        .withDough("Стандартное")
                        .withCheese("Моцарелла")
                        .withSouce("Сырный")
                        .build();
        Pizza pizza3 =
                new PizzaBuilder()
                        .withSausage("Салями")
                        .withDough("Тонкое")
                        .withSouce("Томатный")
                        .withCheese("Копченный")
                        .withMushrooms("Шампиньоны")
                        .withPineapple("Ананасы")
                        .withTomatoes("Черри")
                        .build();


        Cat pinkCat = new PinkCat("Alisa");
        Cat whiteCat = new WhiteCat("Barsik");
        Cat clonePinkCat = pinkCat.copy();
        Cat clonedWhiteCat = whiteCat.copy();
        clonePinkCat.setName("Liza");
        clonedWhiteCat.setName("Tom");

        logger.info("Pink cat: " + clonePinkCat.getName());
        logger.info("White cat: " + clonedWhiteCat.getName());
    }
}
