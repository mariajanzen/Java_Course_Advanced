package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Person p1= new Person("Janzen", "Maria");
	    p1.addAddress(new PersonAddress("maria_yantsen@yahoo.com", "email"));
        p1.addAddress(new PersonAddress("adr2", "billing"));
        p1.addAddress(new PersonAddress("adr3", "post"));


        Person p2= new Person("Janzen", "Eugen");
        p2.addAddress(new PersonAddress("radshow@icloud.com", "email"));
        p2.addAddress(new PersonAddress("adr3", "billing"));
        p2.addAddress(new PersonAddress("adr5", "post"));


        Person p3= new Person("Kolombo", "Kathrin");
        p3.addAddress(new PersonAddress("colombo@icloud.com", "email"));
        p3.addAddress(new PersonAddress("adr7", "billing"));
        p3.addAddress(new PersonAddress("adr9", "post"));

        List<Person> people=new ArrayList <>();
        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(PersonListHandler.personListHandler(people));

      // PersonListHandler.setType("billing");

    }

    /*public static List<String> personListHandler
            (List<Person> list){
        return null;

    }*/
}
