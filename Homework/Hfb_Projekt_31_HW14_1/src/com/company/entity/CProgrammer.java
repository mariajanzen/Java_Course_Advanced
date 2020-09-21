package com.company.entity;

public class CProgrammer extends Programmer {
    public CProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("I am C Programmer. I am writing a C Program.");
    }


}
