package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void getDollarValue(String currency) {
        double dollar;
        switch (currency) {
            case "EUR":
                dollar = 0.89;
                break;
            case "RUB":
                dollar = 74.87;
                break;
            case "USD":
                dollar = 1;
                break;
            default:
                dollar=0;
                break;
        }
    }
    public static double currencyChange(double eur, double rub){
        if (eur=1
    }
            /* double dollar;
            switch(currency){
                case "EUR":
                    dollar=0.89;
                    break;
                case "RUB":
                    dollar=74.87;
                    break;
                case "USD":
                    dollar=1;
                    System.out.println(dollar);
                    break;

                default:

                    break;

            }
}
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
*/

}
