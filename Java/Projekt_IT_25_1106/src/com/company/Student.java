package com.company;

public class Student {
    private String name;
    private String group;
    private Rate rate;
    private int[] rateArray;



    public Student(String name, String group, Rate rate, int[] rateArray){
        this.name=name;
        this.group=group;
        this.rate = rate;
        this.rateArray=rateArray;
    }

    public String toString(){
        return "Student ("+name+"; "+group+"); - ["+ rate.getRate()+"]";
    }

    private void calcRate(){
        double avgRate=0.0;
        for (int rate: rateArray){
            avgRate+=rate;
        }
        rate = avgRate/ rateArray.length;
    }

}
