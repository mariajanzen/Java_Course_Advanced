package com.company;

import com.company.persons.Person;
import com.company.rooms.Rooms;

public class Booking {
    private Rooms room;
    private Person person;


    public Booking(int roomNumber, String name, String arrDate, String outDate) {
        this.room.getRoomNumber()=roomNumber;
        this.person.getName()=name;
        this.person.getArrDate()=arrDate;
        this.person.getOutDate()=outDate;

    }

    public Booking[] getBookings(Person[] persons, Rooms[] rooms){
        Booking[] bookings=new Booking[persons.length];
        for (int i=0; i<persons.length; ++i) {
            if (persons[i].getNumberOfGuests()==rooms[i].getCapacity()){
                bookings[i]= new Booking(rooms[i].getRoomNumber(), persons[i].getName(), persons[i].getArrDate(), persons[i].getOutDate());

            }
        }
        return bookings;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "room=" + room +
                ", person=" + person +
                '}';
    }
}
