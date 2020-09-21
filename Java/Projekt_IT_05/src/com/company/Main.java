package com.company;

public class Main {

    public static void main(String[] args) {
        String monthString = getStringMonth(1);
        System.out.println(monthString);
        System.out.println(checkDiv( 10, 2));
        System.out.println(checkDiv( 10, 3));
        System.out.println(checkDiv( 10, 0));
        System.out.println("------------");
        System.out.println(checkDiv( 0, 14));
        System.out.println(checkDiv( -10, 14));
        System.out.println(checkDiv( 10, -14));
        System.out.println(checkDiv( 10, -10));
        System.out.println("------------");
        System.out.println("is Leap "+isLeap(2019));
        System.out.println("is Leap "+isLeap(2018));
        System.out.println("is Leap "+isLeap(2020));
    }

    public static boolean checkDiv(int a, int b){

        return ((b!=0) && (a%b) ==0);
       // boolean checkresult = (a%b)==0;
      //  if (checkresult) {
         //   return true;
       // } else {
        //    return false;
       // }

    }

    public static String getStringMonth(int month) {
        String monthString="";
        if (checkMonth(month)) {
            if (month == 1) {
                monthString = "январь";
            }
            if (month == 2) {
                monthString = "февраль";
            }
            if (month == 3) {
                monthString = "март";
            }
            //.......

        } else {
            monthString = "error";
        }
        return monthString;
    }


    public static boolean checkMonth(int month) {

//        if (month >= 1 && month < 13) {
//            return true;
//        } else {
//            return false;
//        }
//  то же, что выше, но короче:
        return (month >= 1 && month < 13);

    }

    public static boolean isLeap(int year) {
        // %4
        // not % 100
        // but %400
        //return (year%400==0) || (year%4==0) && (year%100!=0);
       // return (year%400==0) || (year%100!=0) && (year%4==0);
        return (year%100!=0)&&(year%4==0)||(year%400==0);
    }
}

