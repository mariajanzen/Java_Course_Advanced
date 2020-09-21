package com.company;

public class HDD {
    int capacity;
    double price;

    public HDD(int capacity, double price){
        this.capacity=capacity;
        this.price=price;
    }

    public String toString(){
        return "The HDD's capacity is "+capacity+", the price is "+price+" Euro.";
    }
}
