package com.company;

public class Main {

    public static void main(String[] args) {
	Account a1=new Account("DE123456789", new Person("Maria", "Janzen"), 10000.78);
	Account a2=new Account("DE2347891", new Person("Oleg", "Solod"), 10620.43);
	Account a3=new Account("DE345678912", new Person("Daria", "Vornau"), 5000.55);
	Account a4=new Account("DE45656789123", new Person("Katja", "Burton"), 573970.68);
	Account a5=new Account("DE567891234", new Person("Lilja", "Fell"), 65432.78);

	Account[] accounts=new Account[]{a1,a2,a3,a4,a5};
	BankProcessing bankProcessing= new BankProcessing(accounts);


	System.out.println(bankProcessing.secureToString());



    }
}
