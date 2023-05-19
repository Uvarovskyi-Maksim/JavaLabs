package org.example.mod;

public class Faculty {
    private String name;
    private Human dean;

    public Faculty(String name, Human dean) {
        this.name = name;
        this.dean = dean;
    }

    public String getName() {
        return name;
    }

    public Human getDean() {
        return dean;
    }
}

