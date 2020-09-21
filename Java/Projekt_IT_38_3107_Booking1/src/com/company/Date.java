package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return day+"-"+month+"-"+year;
    }

    public int getDaysInCurrentYear(){
        int daysCounter=0;
        if(month>1){
            for(int i=1; i<month; ++i){
                daysCounter+=getDaysInMonth(i);
               }
           }
        daysCounter+=this.day;

      return daysCounter;
    }

    public int getDaysInMonth(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear()){
                    return 29;
                }else{
                    return 28;
                }
            default:
                return 0;
        }
    }

    private boolean isLeapYear(){
        return ((year%100!=0 && year%4==0) || year%400==0);
    }

    private boolean dateValidate() {
        if(month >= 1 && month <= 12){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return (day >= 1 && day <= 31);
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return (day >= 1 && day <= 30);
            }
            if (month == 2 && isLeapYear()==true){
                return (day >= 1 && day <= 29);
            } else {
                return ((day >= 1) && (day <= 28));
            }
        }else{
            return false;
        }
    }


}
