package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getPriceWithDiscount(1000, 15));
    }

    public static double getPriceWithDiscount (double price, int flightNumber){
        double priceWithDiscount=0;

        switch (flightNumber){
            case (flightNumber<20):
                priceWithDiscount=price - (price/100);
                break;
            case (flightNumber>=20 && flightNumber<50):
                priceWithDiscount=price - (price/100*5);
                break;
            case (flightNumber>=50 && flightNumber<70):
                priceWithDiscount=price - (price/100*8);
                break;
            case (flightNumber>=70 && flightNumber<100):
                priceWithDiscount=price - (price/100*10);
                break;
            case (flightNumber>=100):
                priceWithDiscount=price - (price/100*15);
                break;
        }
        return priceWithDiscount;
    }
}
