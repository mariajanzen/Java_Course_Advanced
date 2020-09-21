package com.company.repository;

import com.company.entity.*;

public class DBMock {

    private static Employee[] employees = {
            new CProgrammer("Andrew", 3000),
            new CProgrammer("George", 2800),
            new CProgrammer("Helena", 3200),
            new JavaProgrammer("Fred", 4000),
            new JavaProgrammer("Kevin", 3900),
            new JavaScriptProgrammer("Brian", 2400),
            new JavaScriptProgrammer("Vera", 2900),
            new Manager("Leo", 3500, 550),
            new Manager("Theresa", 3700, 1200)
    };


    public static Employee[] getEmployee(){
        return employees;
    }
    public static boolean isProgrammer(Employee employee){
        if (employee instanceof Programmer){
            return true;
        }
        return false;
    }

    public static boolean isManager(Employee employee){
        if (employee instanceof Manager){
            return true;
        }
        return false;
    }

    public static Programmer[] getProgrammers(Employee[] employees){
        int counter=0;
        for (Employee employee:employees){
            if(isProgrammer(employee)){
                counter++;
            }
        }
        if (counter>0){
            Programmer[] programmers=new Programmer[counter];
            int i=0;
            for (Employee employee:employees){
                if(isProgrammer(employee)){
                    programmers[i]=(Programmer) employee;
                    i++;
                }
            }
            return programmers;
        }
        return null;
    }

}
