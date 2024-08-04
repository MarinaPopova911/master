package Person;

import Job.Job;

public class Person {
    public String fio;
    public Integer age;
    public String job;

    public Person(String fio, Integer age, String job) {
        this.fio = fio;
        this.age = age;
        this.job = job;
    }

    public String person() {
        return String.format("ФИО: %s , %d лет, профессия: %s ", fio, age, job);
    }
}
