package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names={"Jack", "Nick", "John", "Anna"};

        System.out.println(names[0].compareTo(names[1]));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Person[]people= {new Person("Jack", 67),
                new Person("Nick", 25),
                new Person("John", 33),
                new Person("Anna", 25),
                new Person("John", 23),
                new Person("Anna", 39)};

        //System.out.println(people[0].compareTo(people[3]));

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));

    }
}
