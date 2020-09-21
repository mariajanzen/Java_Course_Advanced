package com.company;

public class Main {

    public static void main(String[] args) {
		int day = 28;
		int month = 4;
		int year = 2020;

		printDate(28,4,2020,"/");
		printDate(3,5,2020, "-");
		printDate(2,12,2020, "-");

	}
	public static void printDate(int day, int month, int year, String delimiter){
    	String d="";
    	String m="";

		if (day<10) {
			d = "0" + day;
		}else{
			d=d+day;
		}
		if (month<10) {
			m = "0" + month;
		}else{
			m=m+month;
		}
		System.out.println(d+delimiter+m+delimiter+year);
	}

}
