package com.company.rooms;

public class Deluxe extends Rooms {
    private int capacity;
    private int roomNumber;
    private String view;
    private double price;

    public Deluxe(int capacity, int roomNumber, String view, double price) {
        super(capacity, roomNumber, view, price);
    }
}
