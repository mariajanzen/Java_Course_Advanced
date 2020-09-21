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
        return "Name of client: "+client+"; IBAN: "+ iBAN +"; The account's balance: "+balance;
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
        return "Account: "+client+"; IBAN: "+ iBANSecureToString() +"; Balance: "+balance;
    }

    private String iBANSecureToString(){
        String secureIBAN=iBAN.substring(0, 4);
        if (iBAN.length()>6){
            int counter=iBAN.length()-6;
            for (int i=0; i<counter; ++i){
                secureIBAN+="*";
            }
            secureIBAN+=iBAN.substring(iBAN.length()-2);
        }
        return secureIBAN;
    }
}
