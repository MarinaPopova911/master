package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Functional Interface
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        EvenNumClass.func(4, x -> x % 2);
    }
}