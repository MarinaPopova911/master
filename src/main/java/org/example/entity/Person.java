package org.example.entity;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;

    public Person(String surname, String name, String patronymic, String birthday) {
        this.setSurname(surname);
        this.setName(name);
        this.setPatronymic(patronymic);
        this.setBirthday(birthday);
    }

    public Person() {
        this.surname = "";
        this.name = "";
        this.patronymic = "";
        this.birthday = "";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.equals("")) {
            this.surname = "Not indicated surname";
        } else {
            this.surname = surname;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "Not indicated name";
        } else {
            this.name = name;
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        if (patronymic.equals("")) {
            this.patronymic = "Not indicated patronymic";
        } else {
            this.patronymic = patronymic;
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (birthday.equals("")) {
            this.birthday = "Not indicated birthday";
        } else {
            this.birthday = birthday;
        }
    }
}
