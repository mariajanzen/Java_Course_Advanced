package com.company;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee "+name+" (" +salary+")";
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void pay(){
        System.out.println("pay "+getSalary()+" euro, for "+name);
    }
    public void pay(int bonus){
        System.out.println("pay "+(getSalary()+bonus)+" euro, for "+name);
    }


    public void work(){

    }


}

