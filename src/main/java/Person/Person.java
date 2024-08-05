package Person;

import Job.Cook;
import Job.Doctor;
import Job.Job;

public class Person {
    public String fio;
    public Integer age;
    public Job job;

    public Person(String fio, Integer age, Job job) {
        this.fio = fio;
        this.age = age;
        this.job = job;
    }

    public String person() {
        return String.format("ФИО: %s , %d лет, профессия: %s ", fio, age, job.toString());
    }
}
