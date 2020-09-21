package com.company.entity;

public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am Java Programmer. I am writing a Java Program.");
    }

    @Override
    public void codeReview(){
        System.out.println("This Java code is good");
    }
}
