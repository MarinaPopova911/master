package org.example;

import org.example.factorypattern.fabric.CheeseFoodAirportFactory;
import org.example.factorypattern.fabric.ChocolateFoodAirportFactory;
import org.example.factorypattern.fabric.FoodAirportFactory;
import org.example.factorypattern.fabric.SausageFoodAirportFactory;
import org.example.statepattern.NewTaskOrderState;
import org.example.statepattern.OrderState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

/**
 * Factory & State pattern's
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Elena", new CheeseFoodAirportFactory()));
        persons.add(new Person("Matvey", new SausageFoodAirportFactory()));
        persons.add(new Person("Nikolay", new ChocolateFoodAirportFactory()));
        Double sumPrice = 0.0;
        for (Person person : persons) {
            sumPrice += person.preferredFood.createProduct().getPrice();
        }
        logger.info(String.format("Итоговая стоимость %.2f", sumPrice));
        FoodAirportFactory cheeseFoodAirportFactory = new CheeseFoodAirportFactory();
        logger.info(cheeseFoodAirportFactory.createProduct().getName());

        OrderState orderState =
                new NewTaskOrderState()
                        .analysisOrderState()
                        .taskWorkOrderState()
                        .doneOrderState();
        OrderState orderState1 =
                new NewTaskOrderState()
                        .analysisOrderState()
                        .draftOrderState()
                        .newTaskOrderState()
                        .removeOrderState();
        logger.info(orderState.getNameState());
        logger.info(orderState1.getNameState());
    }
}
