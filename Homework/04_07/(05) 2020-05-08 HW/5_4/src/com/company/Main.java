package com.company;

/*
5_4. Реализовать метод, печатающий все високосные годы в интервале от year1 до year2
	Пример: countLeapYears(2000,2009) -> 3 
*/

public class Main {

    public static void main(String[] args) {
        System.out.println("------- while -----------");
        System.out.println(countLeapYearsWhile(1989,2020));

	    System.out.println("------- for -----------");
        System.out.println(countLeapYearsFor(1989,2020));

        System.out.println("------- do while -----------");
        System.out.println(countLeapYearsFor(1989,2020));
    }

    // 5_4 While
    public static int countLeapYearsWhile(int startYear, int finishYear){
        int yearCounter=0;
        int oneYear=startYear;
        while (oneYear<=finishYear){
            if(isLeapYear(oneYear)) {
                yearCounter++;
            }
            oneYear++;
        }
        return yearCounter;
    }


    // 5_4 For
    public static int countLeapYearsFor(int startYear, int finishYear){
        int yearCounter=0;
        for (int oneYear=startYear;oneYear<=finishYear;oneYear++){
            if(isLeapYear(oneYear)) {
                yearCounter++;
            }
        }
        return yearCounter;
    }

    // 5_4 DoWhile
    public static int countLeapYearsDoWhile(int startYear, int finishYear){
        int yearCounter=0;
        int oneYear=startYear;
        do{
            if(isLeapYear(oneYear)) {
                yearCounter++;
            }
            oneYear++;
        }while (oneYear<=finishYear);
        return yearCounter;
    }

    public static boolean isLeapYear(int year){
        return (year%400==0)||((year%4==0)&&(year%100!=0));
    }

}
