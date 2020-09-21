package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Booking {
    //private int id;
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {

        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
           if(dateInterval.isDateIntervalFree(this.dateInterval.getStart(), this.dateInterval.getFinish())){
                return dateInterval;
        }else{
               return null;
           }
        }

    public double getPrice(){
        return this.room.getPrice()*this.dateInterval.getAmountOfDays();
    }


    @Override
    public String toString() {
        return "Booking: " + room +
                ", " + person +
                ", " + dateInterval+ "\n\tprice for "+
                dateInterval.getAmountOfDays()+" day/s is "+ getPrice()+" Euro";
    }
}
