package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EvenNumClass {
    private static Logger logger = LoggerFactory.getLogger(EvenNumClass.class);

    public static void func(Integer value, EvenNumInterfaceClass func) {
        if (func.evenNumFunction(value) == 0) {
            logger.info(String.format("Число %d чётное", value));
        } else {
            logger.info(String.format("Число %d не чётное", value));
        }
    }
}