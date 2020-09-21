package com.company;

public class RAM {
    int capacity;
    double price;

    public RAM(int capacity, double price){
        this.capacity=capacity;
        this.price=price;
    }

    public String toString(){
        return "The RAM's capacity is "+capacity+", the price is "+price+" Euro.";
    }
}
