package com.company;

public class Employee {
    private String name;
    private double salary;
    private String task;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void startTask(String task){
        this.task=task;
        System.out.println("I am starting the task: "+task);
    }

    public void finishTask(){

        System.out.println("I have finished the task: "+task);
    }

    public void paySalary(){
        System.out.println("pay salary: "+ salary);
    }
}
