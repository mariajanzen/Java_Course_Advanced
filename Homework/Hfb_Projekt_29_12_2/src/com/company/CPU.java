package com.company;

public class CPU {
    String title;
    int frequency;
    double price;

    public CPU(String title, int frequency, double price) {
        this.frequency = frequency;
        this.price = price;
        this.title = title;
    }

    public String toString() {
        return "The CPU " + title + ", its frequency is " + frequency + ", the price is " + price + " Euro.";
    }

    public int compareTo(int frequency) {
        if (this.frequency > frequency) return 1;
        if (this.frequency < frequency) return -1;
        return 0;
    }
}
