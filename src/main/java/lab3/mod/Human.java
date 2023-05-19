package org.example.mod;

public class Human {
    private String firstName;
    private String lastName;
    private String parentage;
    private Sex gender;

    public Human(String firstName, String lastName, String parentage, Sex gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentage = parentage;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getParentage() {
        return parentage;
    }

    public Sex getGender() {
        return gender;
    }
}
