package org.example;

import entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HashCode
 *
 */
public class App 
{
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        Person person1 = new Person("Иванов Иван Иванович", "12.12.1990","89653471234", "черный", "Москва");
        Person person2 = new Person("Петров Петр Петрович", "12.12.1990","89653471234", "черный", "Москва");
        Person person3 = new Person("Иванов Иван Иванович", "11.12.1990","89653471234", "черный", "Москва");
        Person person4 = new Person("петров Петр Петрович", "12.12.1990","89653471234", "черный", "Москва");
        logger.info(String.valueOf(person1.equals(person3)));
        logger.info(String.valueOf(person2.equals(person4)));
        logger.info(String.valueOf(person1.hashCode()));
        logger.info(String.valueOf(person2.hashCode()));
        logger.info(String.valueOf(person4.hashCode()));
    }
}
