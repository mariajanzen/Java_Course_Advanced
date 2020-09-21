package com.company.persons;

public class Date {
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

   @Override
    public String toString(){
        String date="";
        if (dateValidate(day,month,year)==true){
            return date=getDay()+"-"+getMonth()+"-"+getYear();
        }
        return "date incorrect";

   }
    public int getDay() {
        if (checkDay(day)==true) {
            return day;
        }
        return 0;
    }

    public int getMonth() {
        if(checkMonth(month)==true) {
            return month;
        }
        return 0;
    }

    public int getYear() {
        if(year>=0){
            return year;
        }
        return 0;
    }

    private boolean checkDay(int day){
        return (day>=1 && day<=31);
    }

    private static boolean isLeapYear(int year){
        return ((year%100!=0 && year%4==0) || year%400==0);
    }

    private static boolean dateValidate(int day, int month, int year) {
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
    private static boolean checkMonth(int month) {
        return (month >= 1 && month <= 12);
    }
}
