package com.company;

import java.util.ArrayList;
import java.util.List;

public class PersonListHandler {
    private static String type="email";

    public static List<String> personListHandler(List<Person> people){
        List<String> personList=new ArrayList <>();
        if(people!=null){
            for(Person person:people){
                List<PersonAddress> tempAddressList=person.getAddresses(type);
                String nameString = person.getFirstName()+' '+person.getSecondName();
                for (PersonAddress adr: tempAddressList){
                    personList.add(new String (adr.getAddress()+' '+nameString));
                }
            }
        }
        return personList;
    }

    public static void setType(String type) {
        PersonListHandler.type = type;
    }

    /*public static List<String> personListHandler(List<Person> people){
        return personListHandler(people, "e-mail");
    }*/
}
