package com.company.entity;

public class JavaScriptProgrammer extends Programmer{
    public JavaScriptProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void codeReview(){
        System.out.println("This JavaScript code is good");
    }

}
