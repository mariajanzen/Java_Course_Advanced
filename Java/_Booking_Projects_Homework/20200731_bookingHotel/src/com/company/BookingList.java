package com.company;

import java.util.Comparator;

public interface BookingList {
    void add(Booking booking);
    int size();
    void print();
    Booking getBookingByIndex(int index);
    Booking find(Booking booking);


    Booking[] getSortedArray(Comparator<Booking> comparator);
}
