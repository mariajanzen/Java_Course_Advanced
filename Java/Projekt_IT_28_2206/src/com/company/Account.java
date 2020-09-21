package com.company;

public class Account {
    private String iBAN;
    private Person client;
    private double balance;

    public Account(String iBAN, Person client, double balance){
        this.balance=balance;
        this.client=client;
        this.iBAN = iBAN;
    }

    public String toString(){
        return "Name of client: "+client+"; IBAN: "+ iBAN +"; The balance= "+balance;
    }

    public double getBalance() {
        return balance;
    }

    public Person getClient() {
        return client;
    }

    public String getIBAN() {
        return iBAN;
    }

    public String secureToString(){
        return "Name of client: "+client+"; IBAN: "+ iBANSecureToString() +"; The account's balance= "+balance;
    }

    public String iBANSecureToString(){
        if(iBAN.length()>6){
            String res=iBAN.substring(0,4);
            int countStars=iBAN.length()-6;
            while (countStars>0){
                res+="*";
                countStars--;
            }
            res+=iBAN.substring(iBAN.length()-2);
            return res;
        }else{
            return iBAN;
        }

    }
}
