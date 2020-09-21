package com.company;

public class Main {

    public static void main(String[] args) {
	    Account client1=new Account("DE123456789", new Person("Maria", "Yantsen"), 65748.98);
        Account client2=new Account("DE2345678", new Person("Lilia", "Fell"), 744449.09);
        Account client3=new Account("DE345678912", new Person("Margarita", "Driburg"), 647290.43);
        Account client4=new Account("DE45678912", new Person("Alexander", "Gerken"), 786.98);
        Account client5=new Account("DE68912345", new Person("Elena", "Enns"), 4352678.87);
        Account client6=new Account("DE125678934", new Person("Klaudia", "Werner"), 456789.89);

        Account[] accounts=new Account[]{client1,client2,client3,client4,client5,client6};
        BankProcessing bankProcessing= new BankProcessing(accounts);

        bankProcessing.print();

        System.out.println("===============");
        System.out.println(bankProcessing.secureToString());

        System.out.println(bankProcessing.getBankBalance());

        double[] arr={1, 2.0, 2.8};
        



    }
}
