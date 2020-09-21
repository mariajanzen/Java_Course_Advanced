package com.company;

/*
5_3. Реализовать метод, печатающий все високосные годы в интервале от year1 до year2
        Пример: printLeapYears(2000,2009) -> 2000
                                             2004
                                             2008
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("------- while -----------");
	    printLeapYearsWhile(1989,2020);

	    System.out.println("------- for -----------");
	    printLeapYearsFor(1989,2020);

        System.out.println("------- do while -----------");
        printLeapYearsFor(1989,2020);
    }

    // 5_3 While
    public static void printLeapYearsWhile(int startYear, int finishYear){
        int oneYear=startYear;
        while (oneYear<=finishYear){
            if(isLeapYear(oneYear)) {
                System.out.println(oneYear);
            }
            oneYear++;
        }
    }


    // 5_3 For
    public static void printLeapYearsFor(int startYear, int finishYear){
        for (int oneYear=startYear;oneYear<=finishYear;oneYear++){
            if(isLeapYear(oneYear)) {
                System.out.println(oneYear);
            }
        }
    }

    // 5_3 DoWhile
    public static void printLeapYearsDoWhile(int startYear, int finishYear){
        int oneYear=startYear;
        do{
            if(isLeapYear(oneYear)) {
                System.out.println(oneYear);
            }
            oneYear++;
        }while (oneYear<=finishYear);
    }

    public static boolean isLeapYear(int year){
        return (year%400==0)||((year%4==0)&&(year%100!=0));
    }

}
