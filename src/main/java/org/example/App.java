package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import static org.example.ColorEnum.BLACK;

/**
 * Logger
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(15);
        arrayList.add(12);
        arrayList.add(18);
        arrayList.add(18);
        arrayList.remove(2);
        logger.info(String.valueOf(arrayList));

        Collection distinctArray = new HashSet(arrayList);
        logger.info(String.valueOf(distinctArray));


        ColorCar car = new ColorCar("Audi", BLACK);
        ColorCar car2 = new ColorCar("Lada", ColorEnum.YELLOW);

        switch (car.getColorCar()) {
            case BLACK:
            case BROWN:
            case VIOLET:
            case WHITE:
            case BLUE:
                logger.info(String.format("Цвет: %s не яркий", car.getColorCar().getNameColor()));
                break;
            case YELLOW:
            case RED:
            case GREEN:
            case PINK:
                logger.info(String.format("Цвет: %s яркий", car.getColorCar().getNameColor()));
                break;
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nissan", 4);
        map.put("Shkoda", 2);
        map.put("Nissan", 24);
        logger.info(String.valueOf(map.get("Nissan")));
    }
}
