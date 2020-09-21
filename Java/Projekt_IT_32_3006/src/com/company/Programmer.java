package com.company;

public class Programmer extends Employee {

     Programmer(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("programmer: I'm writing a code");
    }
}
