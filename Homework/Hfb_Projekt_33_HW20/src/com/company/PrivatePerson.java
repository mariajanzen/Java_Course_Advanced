package com.company;

public class PrivatePerson extends Client {
    private String firstName;
    private String lastName;

    public PrivatePerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Private Person: " +
                firstName +" "+ lastName;
    }
}
