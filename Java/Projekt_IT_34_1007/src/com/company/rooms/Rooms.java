package com.company.rooms;

public class Rooms {
    private int capacity;
    private int roomNumber;
    private String view;
    private double price;

    public Rooms(int capacity, int roomNumber, String view, double price) {
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.view = view;
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getView() {
        return view;
    }

    @Override
    public String toString() {
        return "This room with a view to the " +
                view + " is intended to max "  +
                +capacity+" Person/s. Their price is "+price+"$.";
    }

    public String roomToString() {
        return "The room " +roomNumber;
    }


}
