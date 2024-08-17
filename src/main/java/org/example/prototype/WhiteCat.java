package org.example.prototype;

public class WhiteCat implements Cat {
    private String name;

    public WhiteCat(String name) {
        this.name = name;
    }

    public Cat copy() {
        return new WhiteCat(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
