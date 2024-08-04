package org.example;

import Job.Job;
import Job.Cook;
import Job.Doctor;
import Job.Engineer;
import Job.Loader;
import Person.Person;
import Job.Documents;

/**
 * Job
 */
public class App {
    public static void main(String[] args) {
        Job cook = new Cook("повар");
        Job doctor = new Doctor("Врач");
        Job engineer = new Engineer("Инженер");
        Job loader = new Loader("Грузчик");
        Person[] pers = {new Person("Иванов Иван Иванович", 45, cook.toString()),
                new Person("Петров Петр Петрович", 34, doctor.toString()),
                new Person("Игнатьев Игнат Игнатович", 56, engineer.toString()),
                new Person("Александров Александр Александрович", 40, loader.toString())};

        for (int i = 0; i < pers.length; i++) {
            System.out.println(pers[i].person());
        }
    }
}
