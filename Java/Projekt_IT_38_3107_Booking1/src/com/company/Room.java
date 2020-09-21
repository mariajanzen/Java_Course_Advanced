package com.company;

public abstract class Room {
    private String number;
    private int capacity;
    private final double basePrice=100.0;

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        return "Room #" + number;
    }
}
