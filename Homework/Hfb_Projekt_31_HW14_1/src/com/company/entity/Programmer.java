package com.company.entity;

public class Programmer extends Employee{
    public Programmer(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("I am programmer. I write a Program");
    }

    public void codeReview(){
        System.out.println("This code is good");
    }

    public void pay(){
        System.out.println("Pay: "+getSalary()+" to "+getName());
    }


}
