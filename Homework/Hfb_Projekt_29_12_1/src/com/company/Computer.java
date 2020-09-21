package com.company;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    double price;

    public Computer(String cpu, int ram, int hdd, double price){
        this.cpu=cpu;
        this.hdd=hdd;
        this.price=price;
        this.ram=ram;
    }

    public String toString(){
        return cpu+"; ram: "+ram+"; hdd: "+hdd+"; price is: "+price+" Euro;";
    }

    public int compareTo(Computer computer){
        if (this.price>computer.price) return 1;
        if (this.price<computer.price) return -1;
        return 0;
    }
}
