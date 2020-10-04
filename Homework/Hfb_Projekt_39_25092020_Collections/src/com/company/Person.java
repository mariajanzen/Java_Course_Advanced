package com.company;

import java.util.Objects;

public class Person {
    private String Name;
    private PersonsAddress address;

    public Person(String name, PersonsAddress address) {
        Name = name;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public PersonsAddress getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(Name, person.Name) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, address);
    }
}
