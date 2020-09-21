package com.company;

import com.company.repository.DBMockPersons;
import com.company.repository.DBMockRooms;
import com.company.persons.Person;
import com.company.rooms.Rooms;

public class Main {

    public static void main(String[] args) {

        Rooms[] rooms= DBMockRooms.getRooms();


        Person[] persons= DBMockPersons.getPersons();
        for (Person person:persons){
            System.out.println(person.dateToString());
        }



    }


}
