package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        currencyInDollar("RUB");
        currencyInDollar("USD");
        currencyInDollar("EUR");
        currencyInDollar("III");


    }

    public static void currencyInDollar(String currency){
        double dollar =0;
        String error="";
        switch(currency){
            case "EUR":
                dollar=0.89;
                System.out.println(dollar);
                break;
            case "RUB":
                dollar=74.87;
                System.out.println(dollar);
                break;
            case "CNY":
                dollar=0.14;
                System.out.println(dollar);
                break;
            case "USD":
                dollar=1;
                System.out.println(dollar);
                break;
            case "CAD":
                dollar=0.71;
                System.out.println(dollar);
                break;
            case "HKD":
                dollar=7.75;
                System.out.println(dollar);
                break;
            default:
                error = "error";
                System.out.println(error);
                break;

        }

    }

}
