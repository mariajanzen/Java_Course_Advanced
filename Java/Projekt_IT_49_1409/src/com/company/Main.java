package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // write your code here

        List <String> listOfString = new ArrayList <>();
        listOfString.add("Olga");
        listOfString.add("Maria");
        listOfString.add("Jack");
        listOfString.add("Iwan");
        listOfString.add("Olga");
        listOfString.add("Jack");
        listOfString.add("Maria");
        listOfString.add("Gregor");


        List <String> resList = new ArrayList <>(new HashSet <>(listOfString));

        System.out.println(getUniqueString(listOfString).toString());

        List<Person> personsList= Arrays.asList(new Person("Jack"),
                new Person("Gregor"),
                new Person("Nick"),
                new Person("Maria"),
                new Person("Gregor"),
                new Person("Nick"),
                new Person("Maria"));


        System.out.println("------------------");
        System.out.println(getUniquePerson(personsList).toString());

    }

    public static List<String> getUniqueString(List<String> list){
        if(list==null) return new ArrayList <String>();
        List<String> newList=new ArrayList <>(new HashSet <String>(list));
        return newList;
    }

    public static List <Person> getUniquePerson(List<Person> list){
        if(list==null) return new ArrayList <Person>();
        List<Person> newList=new ArrayList <>(new HashSet <Person>(list));
        return newList;
    }




}
