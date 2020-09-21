package com.company;

import com.company.entity.Programmer;
import com.company.repository.DBMock;

public class Main {

    public static void main(String[] args) {

        EmployeeArray employees= new EmployeeArray(DBMock.getEmployee());
        //Programmer[] programmers= DBMock.getProgrammers(employees);

        employees.workAll();
        System.out.println("---------------\n");
        employees.codeReviewAll();
        System.out.println("---------------\n");
        employees.payAll();
        System.out.println("---------------\n");




    }
}
