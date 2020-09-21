package com.company;

public class Car {
    String brand;
    String colour;
    double price;

    public Car(String brand, String colour, double price){
        this.brand=brand;
        this.price=price;
        this.colour=colour;
    }

    public String toString(){
        return brand+"; colour: "+colour+"; price: "+ price;
    }
}
