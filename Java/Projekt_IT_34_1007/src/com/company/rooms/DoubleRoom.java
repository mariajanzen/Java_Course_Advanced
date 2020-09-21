package com.company.rooms;

public class DoubleRoom extends Rooms {
    private int capacity;
    private int roomNumber;
    private String view;
    private double price;

    public DoubleRoom(int capacity, int roomNumber, String view, double price) {
        super(capacity, roomNumber, view, price);
    }
}
