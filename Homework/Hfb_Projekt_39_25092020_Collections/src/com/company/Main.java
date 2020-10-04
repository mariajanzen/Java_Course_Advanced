package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person1=new Person("Ivan", new PersonsAddress("Highway Street", 5));
        Person person2=new Person("Maria", new PersonsAddress("Clean Alley", 123));
        Person person3=new Person("Stephan", new PersonsAddress("Mackensy Way", 54));
        Person person4=new Person("John", new PersonsAddress("Bahnhofstraße", 67));
        Person person5=new Person("Amalia", new PersonsAddress("Beverly Hills", 114));
        Person person6=new Person("Rosa", new PersonsAddress("Rosemarin Street", 8));

        List<Person> people= new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);

        System.out.println(getAddresses(people).toString()); // HW Списки.1
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");

        List<String> personsNames=getNames(people);
        System.out.println(getNewListOfNamesNotFour(personsNames).toString()); // HW Списки.2

        List<Integer> ints1=new ArrayList<>();
        List<Integer> ints2=new ArrayList<>();


    }

    public static List<PersonsAddress> getAddresses(List<Person> persons){
        List<PersonsAddress> resList=new ArrayList<>();
        for (Person person:persons){
            resList.add(person.getAddress());
        }
        return resList;
    }

    public static List<String> getNames(List<Person> persons){
        List<String> resListOfNames=new ArrayList<>();
        for (Person person:persons){
            resListOfNames.add(person.getName());
        }
        return resListOfNames;
    }

    public static List<String> getNewListOfNamesNotFour(List<String> namesNotFour){
        List<String> resListOfNames=new ArrayList<>();
        for(String str:namesNotFour){
            if(str.length()!=4){
                resListOfNames.add(str);
            }
        }
        return resListOfNames;
    }
}
