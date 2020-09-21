package com.company;

public class Rate {
    private String subject;
    private double rate;


    public Rate (String subject, double rate){
        this.rate=rate;
        this.subject=subject;
    }

    public double getRate(){
        if (rate ==0.0){
            calcRate();
        }
        return rate;
    }


}
