package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // System.out.println(alarm(6, "open"));
        //System.out.println(alarm(8, "open"));
        System.out.println("--------------");
        System.out.println(alarm(13, "open"));
        System.out.println(alarm(13, "closed"));
        System.out.println(alarm(11, "open"));
        System.out.println(alarm(21, "closed"));
        System.out.println(alarm(23, "open"));
        System.out.println(alarm(5, "closed"));

    }

    public static String alarm(int t, String d){


        if (checkTime(t) && checkDoor(d)) {
            return "alarm! alarm!";
        }else{
            return "the system is on";
        }

    //return (checkTime(t) && checkDoor(d));
    }

    public static boolean checkDoor(String d){
       return (d=="open");

    }
/*
    public static boolean checkTime(int t){
        return (t >= 0 && t < 7) || (t == 23);

    }
*/
     public static boolean checkTime(int t) {
         return (t >= 0 && t < 7) || (t >= 13 && t <= 14) || (t == 23);
     }
}
