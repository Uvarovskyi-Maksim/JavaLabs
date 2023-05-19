package org.example.mod;

public class University {
    private String name;
    private Human rector;

    public University(String name, Human rector) {
        this.name = name;
        this.rector = rector;
    }

    public String getName() {
        return name;
    }

    public Human getRector() {
        return rector;
    }
}
