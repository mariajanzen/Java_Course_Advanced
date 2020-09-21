package com.company;

public class DBMock {
    public static Employee[] getEmployees(){
        Programmer p1=new Programmer("Jack", 2000.00);
        Programmer p2=new Programmer("Nick", 4000.00);
        Tester t1=new Tester("Anna", 3000.00);
        Tester t2=new Tester("Alex", 1800.00);

        Employee[] employees=new Employee[]{
                p1,
                t1,
                p2,
                t2,
                new Tester("Klara", 3000.00)
        };

        return employees;
    }
}
