package org.example;

public class Country {
    private String name;
    private Integer square;
    private Integer countPers;

    public Country(String name, Integer square, Integer countPers) {
        this.name = name;
        this.square = square;
        this.countPers = countPers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSquare() {
        return square;
    }

    public void setSquare(Integer square) {
        this.square = square;
    }

    public Integer getCountPers() {
        return countPers;
    }

    public void setCountPers(Integer countPers) {
        this.countPers = countPers;
    }

    public Integer getCntPersSquare() {
        return countPers / square;
    }
}
