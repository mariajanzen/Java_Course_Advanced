package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getPriceWithDiscount(1000, 50));
    }

    public static double getPriceWithDiscount (double price, int flightNumber){
        double priceWithDiscount=price - priceAmount(double x);
        return priceWithDiscount;

    }



    public static double priceAmount(double x){
        double price;
        int flightNumber;

        if (flightNumber<20) {
            return x = (price / 100);
        }
        if (flightNumber >= 20 && flightNumber < 50) {
                return x = (price / 100 * 5);
            }
        if (flightNumber >= 50 && flightNumber < 70) {
                return x = (price / 100 * 8);
            }
        if (flightNumber >= 70 && flightNumber < 100) {
                return x = (price / 100 * 10);
            }
        if (flightNumber >= 100) {
                return x = (price / 100 * 15);
            }


   // public static double getEndPrice{price
   //     double priceWithDiscount=0;
   //     int fN=getDiscountNumber(flightNumber);

        switch (fN){
            case 1:
                priceWithDiscount=price - (price/100);
                break;
            case 2:
                priceWithDiscount=price - (price/100*5);
                break;
            case 3:
                priceWithDiscount=price - (price/100*8);
                break;
            case 4:
                priceWithDiscount=price - (price/100*10);
                break;
            case 5:
                priceWithDiscount=price - (price/100*15);
                break;
        }
        return priceWithDiscount;
    }



    public static int getDiscountNumber(int flightNumber){
        int discountNumber=0;
        String error="error";
        if (flightNumber<20){
            discountNumber=1;
        }
        if (flightNumber>=20 && flightNumber<50){
            discountNumber=2;
        }
        if (flightNumber>=50 && flightNumber<70){
            discountNumber=3;
        }
        if (flightNumber>=70 && flightNumber<100){
            discountNumber=4;
        }
        if (flightNumber>=100){
            discountNumber=5;
        }
        return discountNumber;
    }



}
