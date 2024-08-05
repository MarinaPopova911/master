package org.example;

import Job.Job;
import Job.Cook;
import Job.Doctor;
import Job.Engineer;
import Job.Loader;
import Person.Person;
import Job.Document;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Job
 */
public class App {
    public static void main(String[] args) {
        Person[] pers = {new Person("Иванов Иван Иванович", 45, new Cook(new Document("Сертификат", "I-4BC", "676767"))),
                new Person("Петров Петр Петрович", 34, new Doctor(new Document("Диплом", "I-5AC", "545454"), new Document("Сертификат", "I-4BB", "3333"))),
                new Person("Игнатьев Игнат Игнатович", 56, new Engineer(new Document("Диплом", "I-4DC", "77777"))),
                new Person("Александров Александр Александрович", 40, new Loader())};

        for (int i = 0; i < pers.length; i++) {
            System.out.println(pers[i].person());
        }
    }
}
