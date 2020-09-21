package com.company;

public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts){
        this.bankAccounts=bankAccounts;
    }

    public String toString(){
        String res="";
        for (Account account:bankAccounts){
            res+=account.toString()+"\n";
        }
        return res;
    }
    public String secureToString(){
        String res="";
        for (Account account:bankAccounts){
            res+=account.secureToString()+"\n";
        }
        return res;
    }

    public Person[] getClientsArray(){
        Person[] clients=new Person[bankAccounts.length];
        for(int i=0; i<clients.length; ++i){
            clients[i]=bankAccounts[i].getClient();
        }
        return clients;
    }

    public double getBankBalance(){
        double bankBalance=0;
        for(Account account:bankAccounts){
            bankBalance+=account.getBalance();
        }
        return bankBalance;
    }


    public void print(){
        for(int i=0; i<bankAccounts.length; ++i){
            System.out.print(bankAccounts[i]+"\n");
        }
        System.out.println();
    }
}
