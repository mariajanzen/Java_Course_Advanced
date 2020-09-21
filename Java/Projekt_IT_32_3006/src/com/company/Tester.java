package com.company;

public class Tester extends Employee{

    public Tester(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("tester: I'm testing a program");
    }
    @Override
    public String toString() {
        return "Tester "+super.getName()+" (" +super.getSalary()+")";
    }

    /* @Override
    public String toString() {
        return "Tester "+super.getName()+" (" +salary+")";
    }*/
}