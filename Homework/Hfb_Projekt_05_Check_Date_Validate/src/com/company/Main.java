package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month;
        System.out.println(getStringMonth(5));
        System.out.println(getStringMonth(1));
        System.out.println(getStringMonth(13));
        System.out.println(getStringMonth(-1));
        System.out.println(getStringMonth(10));
        System.out.println("-----------------");
        System.out.println(checkDiv(2,5));
        System.out.println(checkDiv(8,4));
        System.out.println("-----------------");
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2018));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(1700));
        System.out.println("-----------------");
        System.out.println(dateValidate(29,2,2020));
        System.out.println(dateValidate(29,2,2019));





    }

    public static boolean checkMonth(int month){

           return (month>=1&&month<=12);

            //сначала сделала в мэйне вывод checkMonth,
        // а здесь прописала полностью с if,
        // но почему-то начал ругаться на boolean и сказал заменить на void
        }


    public static String getStringMonth(int month){
        String monthString="";
        if (checkMonth(month)) {
            if (month == 1) {
                monthString="январь";
            }
            if (month == 2) {
                monthString="февраль";
            }
            if (month == 3) {
                monthString="март";
            }
            if (month == 4) {
                monthString="апрель";
            }
            if (month == 5) {
                monthString="май";
            }
            if (month == 6) {
                monthString="июнь";
            }
            if (month == 7) {
                monthString="июль";
            }
            if (month == 8) {
                monthString="август";
            }
            if (month == 9) {
                monthString="сентябрь";
            }
            if (month == 10) {
                monthString="октябрь";
            }
            if (month == 11) {
                monthString="ноябрь";
            }
            if (month == 12) {
                monthString="декабрь";
            }
        }else{
            monthString="error";
        }
        return monthString;
    }

    public static boolean checkDiv(int a, int b){
        return a % b == 0;
    }

    public static boolean isLeapYear(int year){
        return ((year%100!=0 && year%4==0) || year%400==0);
    }

    public static boolean checkDay(int day){
        return (day>=1 && day<=31);
    }

    public static boolean dateValidate(int day, int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return (day >= 1 && day <= 31);
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return (day >= 1 && day <= 30);
        }
        if (month == 2 && isLeapYear(year)) {
            return (day >= 1 && day <= 29);
        } else {
            return ((day >= 1) && (day <= 28));
        }
    }



}
