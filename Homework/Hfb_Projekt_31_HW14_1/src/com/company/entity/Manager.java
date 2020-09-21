package com.company.entity;

public class Manager extends Employee{
    private double managerBonus;

    public Manager(String name, double salary, double managerBonus) {
        super(name, salary);
        this.managerBonus=managerBonus;
    }

    @Override
    public void pay(){
        System.out.println("Pay for manager "+ getSalary()+" euro."+
                "bonus "+managerBonus+" euro for "+getName());
    }

}
