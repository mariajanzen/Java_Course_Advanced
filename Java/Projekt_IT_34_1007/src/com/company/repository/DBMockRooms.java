package com.company.repository;

import com.company.rooms.*;

public class DBMockRooms {

    private static Rooms[] rooms={
            new SingleRoom(1, 203, "sea", 123.00),
            new SingleRoom (1, 210, "garden", 118.00),
            new DoubleRoom(3, 213, "sea", 168.00),
            new DoubleRoom (3, 205, "garden", 153.00),
            new Deluxe(4, 201, "sea", 240.00),
            new Deluxe (4, 202, "sea", 240.00),
            new Deluxe (4, 204, "garden", 230.00),
            new Apartment(4, 206, "sea", 235.00),
            new Apartment (4, 207, "garden", 220.00),
            new Apartment (4, 208, "sea", 250.00)

    };

public static Rooms[] getRooms(){
    return rooms;

    }

}
