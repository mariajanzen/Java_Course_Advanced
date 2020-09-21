package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayBookingList implements BookingList{
    private Booking[] bookings;
    private int size=0;
    private int capacity=3;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings = new Booking[this.capacity];
    }

    @Override
    public void add(Booking booking) {
        if(size<capacity){
            bookings[size++]=booking;
        } else {
            capacity*=2;
            Booking[] temp = new Booking[capacity];
            for(int i=0;i<bookings.length;i++){
                temp[i]= bookings[i];
            }
            bookings = temp;
            bookings[size++]=booking;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (int i=0;i<size;i++){
            System.out.println(bookings[i]);
        }
    }

    @Override
    public Booking getBookingByIndex(int index) {
        if((index>=0)&&(index<bookings.length)){
            Booking booking=bookings[index];
            System.out.println("The booking number "+(index+1)+" is "+bookings[index].toString());
            return booking;
        }
        return null;
    }

    @Override
    public Booking find(Booking booking) {
        for(int i=0; i<bookings.length;++i){
            if(bookings[i].equals(booking)){
                System.out.println("This booking is "+bookings[i].toString());
                return bookings[i];
            }
        }
        System.out.println("That booking was not found");
        return null;
    }

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        Arrays.sort(bookings,comparator);
        return bookings;

    }
}
