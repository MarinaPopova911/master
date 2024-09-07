package org.example;

import Calculator.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Logger
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        logger.info(String.format("Сумма %.2f и %.2f равна %.2f", 5.0, 6.0, calculator.sum(5.0, 6.0)));
    }
}
