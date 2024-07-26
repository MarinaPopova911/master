package org.example;

import org.example.entity.Calculator;
import org.example.entity.Person;

/**
 * Person & Calculator
 */
public class App {
    public static void main(String[] args) {
        Person person = new Person();
        Person personTwo = new Person("", "Evan", "Jim", "");
        person.setSurname("");
        person.setName("Eva");
        person.setPatronymic("Eliza");
        person.setBirthday("01.01.2000");
        System.out.println(person.getSurname());
        System.out.println(person.getName());
        System.out.println(person.getPatronymic());
        System.out.println(person.getBirthday());
        System.out.println(personTwo.getSurname());
        System.out.println(personTwo.getName());
        System.out.println(personTwo.getPatronymic());
        System.out.println(personTwo.getBirthday());
        System.out.println(Calculator.addition(1.0, 3.6));
        System.out.println(Calculator.division(4.9, 0.0));
        System.out.println(Calculator.multiplication(3.0, 3.0));
        System.out.println(Calculator.subtraction(3.9, 0.0));
    }
}
