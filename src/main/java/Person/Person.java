package Person;

public class Person {
    public String fio;
    public Integer age;

    public Person(String fio, Integer age) {
        this.fio = fio;
        this.age = age;
    }
    public String person(){
        return String.format("ФИО: %s , %d лет", fio, age);
    }
}
