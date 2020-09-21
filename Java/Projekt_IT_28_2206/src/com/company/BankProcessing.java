package com.company;

public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Person[] getAllClients(){
        Person[] clients=new Person[bankAccounts.length];
        for (int i=0; i<clients.length; ++i){
            clients[i]=bankAccounts[i].getClient();
        }
        return clients;
    }

    public String allClientsToString(){
        Person[] clients=getAllClients();
        String str="";
        for (int i=0; i<clients.length; ++i){
            str+=clients[i]+"\n";
        }
        return str;
    }


    public String toString() {
        String res = "";
        for (Account account : bankAccounts) {
            res += account.toString() + "\n";
        }
        return res;
    }

    public String secureToString() {
        String res = "";
        for (Account account : bankAccounts) {
            res += account.secureToString() + "\n";
        }
        return res;
    }

}
