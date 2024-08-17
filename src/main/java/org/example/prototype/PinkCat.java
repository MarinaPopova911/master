package org.example.prototype;

public class PinkCat implements Cat {
    public String name;

    public PinkCat(String name) {
        this.name = name;
    }

    public Cat copy() {
        return new PinkCat(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
