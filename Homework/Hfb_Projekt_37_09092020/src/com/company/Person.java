package com.company;

public class Person extends Owner {
    private String firstName="";
    private String secondName="";

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public String getName() {
        return getFirstName()+((getFirstName().isEmpty()) ? "" : " ")+getSecondName();
    }
}
