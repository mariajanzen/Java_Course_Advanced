package com.company.rooms;

public class Apartment extends Rooms {
    private int capacity;
    private int roomNumber;
    private String view;
    private double price;

    public Apartment(int capacity, int roomNumber, String view, double price) {
        super(capacity, roomNumber, view, price);
    }

}
