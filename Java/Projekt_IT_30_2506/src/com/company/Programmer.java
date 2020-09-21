package com.company;

public class Programmer extends Employee {


    public Programmer(String name, double salary) {
        super(name, salary);

    }

    public void startTask(String task){
        setTask(task);
        System.out.println("I am programmer. I think about a code.");
        System.out.println("I am starting the task: "+getTask());
    }

    public void finishTask(){
        System.out.println("My code is the best");
        System.out.println("I have finished the task: "+getTask());
    }

}
