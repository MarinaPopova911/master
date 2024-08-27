package org.example.proxypattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FalseCalculator implements CalculatorInterface{
    private static Logger logger = LoggerFactory.getLogger(FalseCalculator.class);
    Double c;
    public void sum(Double a, Double b) {
        c = a + b + 0.01;
        logger.info(String.format("%f + %f = %.2f",a, b, c ));
    }

    public void diff(Double a, Double b) {
        c = a - b - 0.01;
        logger.info(String.format("%f - %f = %.2f",a, b, c));
    }

    public void multiplication(Double a, Double b) {
        c = a * b - 0.01;
        logger.info(String.format("%f * %f = %.2f",a, b, c));
    }

    public void division(Double a, Double b) {
        c = (a/b)+ 0.01;
        logger.info(String.format("%f / %f = %.2f",a, b, c));
    }
}
