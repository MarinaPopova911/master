package org.example;

import org.example.observerpattern.Admin;
import org.example.observerpattern.Publisher;
import org.example.observerpattern.UserObserver;
import org.example.proxypattern.Calculator;
import org.example.proxypattern.CalculatorInterface;
import org.example.proxypattern.FalseCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Proxy & Observer pattern's
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws ParseException {
        CalculatorInterface calculator = new Calculator();
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse("01-04-2024");
        Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse("01-04-2024");
        if (date1.equals(date2)) {
            calculator = new FalseCalculator();
        }
        logger.info(String.format("%f + %f = %.2f", 1.0, 3.0, calculator.sum(1.0, 3.0)));
        logger.info(String.format("%f - %f = %.2f", 3.0, 2.0, calculator.diff(3.0, 2.0)));
        logger.info(String.format("%f / %f = %.2f", 4.0, 2.0, calculator.division(4.0, 2.0)));
        logger.info(String.format("%f * %f = %.2f", 5.0, 2.0, calculator.multiplication(5.0, 2.0)));

        UserObserver user = new UserObserver();
        Admin admin = new Admin();

        Publisher chat = new Publisher();
        chat.addObserver(admin);
        chat.addObserver(user);

        chat.addMessage("Привет");
        chat.addMessage("Пока");

        chat.removeObserver(user);
        chat.addMessage("Пока-пока");

    }
}