package org.example;

import entity.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        logger.info(String.valueOf(calculator.addition(1, 2)));
        logger.info(String.valueOf(calculator.multiplication(1.6, 2.4)));
        logger.info(String.valueOf(calculator.subtraction(3, 5)));
    }
}