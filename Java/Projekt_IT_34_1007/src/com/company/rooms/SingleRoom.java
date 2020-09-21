package com.company.rooms;

public class SingleRoom extends Rooms {
    private int capacity;
    private int roomNumber;
    private String view;
    private double price;

    public SingleRoom(int capacity, int roomNumber, String view, double price) {
        super(capacity, roomNumber, view, price);
    }
}
