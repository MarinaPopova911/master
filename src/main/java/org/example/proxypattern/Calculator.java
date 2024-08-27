package org.example.proxypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator implements CalculatorInterface {
    Double c;
    private static Logger logger = LoggerFactory.getLogger(Calculator.class);
    public void sum (Double a, Double b) {
         c = a + b;
        logger.info(String.format("%f + %f = %.2f",a, b, c ));
    }
    public void diff (Double a, Double b) {
        c = a - b;
        logger.info(String.format("%f - %f = %.2f",a, b, c));
    }
    public void multiplication (Double a, Double b) {
        c = a * b;
        logger.info(String.format("%f * %f = %.2f",a, b, c));
    }
    public void division (Double a, Double b) {
        c = a/b;
        logger.info(String.format("%f / %f = %.2f",a, b, c));
    }
}
