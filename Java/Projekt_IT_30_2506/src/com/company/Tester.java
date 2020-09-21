package com.company;

public class Tester {
    private String name;
    private double salary;
    private String task;

    public Tester(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void startTask(String task){
        this.task=task;
        System.out.println("I am tester. I test the code.");
        System.out.println("I am starting the task: "+task);
    }

    public void finishTask(){
        System.out.println("The code is good.");
        System.out.println("I have finished the task: "+task);
    }

    public void paySalary(){
        System.out.println("pay salary: "+ salary);
    }
}

