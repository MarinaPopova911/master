package entity;

import java.util.Objects;

public class Person {
    String fio;
    String dateBirth;
    String numberPhone;
    String colorHair;
    String city;

    public Person(String fio, String dateBirth, String numberPhone, String colorHair, String city) {
        this.fio = fio;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
        this.colorHair = colorHair;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        Person person = (Person) obj;
        if (dateBirth != person.dateBirth) return false;
        if (city != person.city) return false;
        return fio.equalsIgnoreCase(person.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio.toLowerCase(), dateBirth, city);
    }
}