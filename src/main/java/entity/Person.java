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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return fio.equalsIgnoreCase(person.fio) && dateBirth == person.dateBirth && city == person.city;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio.toLowerCase(), dateBirth, city);
    }
}