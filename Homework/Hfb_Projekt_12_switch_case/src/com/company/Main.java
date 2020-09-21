package com.company;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(printResult(505));
        System.out.println(printResult(400));
        System.out.println(printResult(100));
    }

    public static int doSomething(int errorCode){
        return errorCode;
    }

    public static String printResult(int errorCode){
        String errorName = "";
        switch (errorCode){
            case 404:
                errorName="страница не найдена";
                break;
            case 505:
                errorName="внутренняя ошибка метода";
                break;
            case 400:
                errorName="неверный запрос";
                break;
            case 301:
                errorName="работа метода прервана";
                break;
            default:
                errorName="неопознанная ошибка работы метода";
        }
        return errorName;
    }

}
