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
        Job[] jobs = {new Cook("Повар"),
                new Doctor("Доктор"),
                new Engineer("Инженер"),
                new Loader("Грузчик")};
        Person[] pers = {new Person("Иванов Иван Иванович", 45),
                new Person("Петров Петр Петрович", 34),
                new Person("Игнатьев Игнат Игнатович", 56),
                new Person("Александров Александр Александрович", 40)};

        for (int i = 0; i < jobs.length; i++) {
            System.out.println(pers[i].person() + ", " + jobs[i].toString() );
        }
    }
}
