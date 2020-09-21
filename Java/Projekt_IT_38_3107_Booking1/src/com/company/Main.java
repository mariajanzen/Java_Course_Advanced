package com.company;

public class Main {

    public static void main(String[] args) {

        Booking b1=new Booking(
                new StandardRoom("1", 2),
                new Person("Jack"),
                new DateInterval(new Date(30,7,2020), new Date(10,8,2020))
        );

        Booking b2=new Booking(
                new SuitRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new Date(11,8,2020), new Date(13,8,2020))
        );

        Booking b3=new Booking(
                new DeLuxeRoom("3", 2),
                new Person("Anna"),
                new DateInterval(new Date(28,7,2020), new Date(3,8,2020))
        );

        Booking b4=new Booking(
                new SuitRoom("4", 2),
                new Person("John"),
                new DateInterval(new Date(29,7,2020), new Date(5,8,2020))
        );

        Booking b5=new Booking(
                new DeLuxeRoom("3", 2),
                new Person("Anna"),
                new DateInterval(new Date(2,8,2020), new Date(7,8,2020))
        );

        Booking b6=new Booking(
                new SuitRoom("4", 2),
                new Person("John"),
                new DateInterval(new Date(28,7,2020), new Date(1,8,2020))
        );

        System.out.println(b1);
        System.out.println(b2);
    }
}
