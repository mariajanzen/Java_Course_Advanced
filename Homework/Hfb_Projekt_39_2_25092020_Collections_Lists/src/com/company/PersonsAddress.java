package com.company;

import java.util.Objects;

public class PersonsAddress {
    private String streetName;
    private int houseNumber;

    public PersonsAddress(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address: " +
                streetName + ", " + houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonsAddress address = (PersonsAddress) o;
        return houseNumber == address.houseNumber &&
                Objects.equals(streetName, address.streetName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streetName, houseNumber);
    }
}
