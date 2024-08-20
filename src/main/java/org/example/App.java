package org.example;

import org.example.factorypattern.fabric.CheeseFactory;
import org.example.factorypattern.fabric.ChocolateFactory;
import org.example.factorypattern.fabric.FoodFactory;
import org.example.factorypattern.fabric.SausageFactory;
import org.example.statepattern.NewTaskState;
import org.example.statepattern.TaskState;
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
        persons.add(new Person("Elena", new CheeseFactory()));
        persons.add(new Person("Matvey", new SausageFactory()));
        persons.add(new Person("Nikolay", new ChocolateFactory()));
        Double sumPrice = 0.0;
        for (Person person : persons) {
            sumPrice += person.preferredFood.createProduct().getPrice();
        }
        logger.info(String.format("Итоговая стоимость %.2f", sumPrice));
        FoodFactory cheeseFoodAirportFactory = new CheeseFactory();
        logger.info(cheeseFoodAirportFactory.createProduct().getName());

        TaskState orderState =
                new NewTaskState()
                        .analysisTaskState()
                        .taskWorkTaskState()
                        .doneTaskState();
        TaskState orderState1 =
                new NewTaskState()
                        .analysisTaskState()
                        .draftTaskState()
                        .newTaskState()
                        .removeTaskState();
        logger.info(orderState.getNameState());
        logger.info(orderState1.getNameState());
    }
}
