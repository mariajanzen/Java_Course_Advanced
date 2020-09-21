package com.company;

public class SuitRoom extends Room{
    private final double priceCoefficient=1.3;



    public SuitRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrice()*priceCoefficient;
    }

    @Override
    public String toString() {
        return "SuitRoom #" +
                getNumber()+ " (" + getPrice()+
                ')';
    }
}
