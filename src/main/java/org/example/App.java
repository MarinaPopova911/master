package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Functional Interface & Stream API
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        EvenNumClass.func(4, x -> x % 2);

        List<Country> countryList = Arrays.asList(
                new Country("Болгария", 24, 40000001),
                new Country("Германия", 24, 41000000),
                new Country("Индия", 24, 100000000),
                new Country("Вьетнам", 24, 40300000),
                new Country("Гаити", 10, 40000010)
        );
        countryList.stream()
                .filter(country -> country.getName().contains("а"))
                .filter(country -> country.getCountPers() > 40000000)
                .sorted(Comparator.comparingInt(Country::getCntPersSquare).reversed())
                .collect(Collectors.toList())
                .forEach(country -> System.out.println(country.getName()));
    }
}