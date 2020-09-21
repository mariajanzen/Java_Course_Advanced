package com.company.repository;

import com.company.persons.Date;
import com.company.persons.Person;

public class DBMockPersons {


        private static Person[] persons={
                new Person("Garry Lock", 1986, 1, new Date(23,07,2020), new Date(25,07,2020)),
                new Person("Jack Oldmann", 1975, 4, new Date(21,07,2020), new Date(29,07,2020)),
                new Person("Kathrin Owrell",  1992, 1, new Date(20,07,2020), new Date(23,07,2020)),
                new Person("Olga Friesen", 1989, 2, new Date(18,07,2020), new Date(23,07,2020)),
                new Person("Anna Huels", 1995, 3, new Date(27,07,2020), new Date(30,07,2020)),
                new Person("Patrick Steinbach", 1968, 1, new Date(28,07,2020), new Date(29,07,2020)),


        };

        public static Person[] getPersons(){
            return persons;

        }



}
