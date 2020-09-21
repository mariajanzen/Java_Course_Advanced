package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getWeekDay(5));
        System.out.println(getWeekDay(1));
        System.out.println(getWeekDay(9));
        System.out.println(getWeekDay(-5));

    }
    
    //public static boolean checkWeekDay(int day){
      // return ((day >= 1) && (day <= 7));

   // }
    public static String getWeekDay(int day){
        String weekDayString="";

        switch(day){
            case 1:
                weekDayString ="понедельник";
                break;
            case 2:
                weekDayString ="вторник";
                break;
            case 3:
                weekDayString ="среда";
                break;
            case 4:
                weekDayString ="четверг";
                break;
            case 5:
                weekDayString ="пятница";
                break;
            case 6:
                weekDayString ="суббота";
                break;
            case 7:
                weekDayString ="воскресенье";
                break;

           default:
               weekDayString ="ошибка";
        }
        return weekDayString;

    }
}
