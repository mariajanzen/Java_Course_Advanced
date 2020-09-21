package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names=new String[]{"Иванов Иван Иванович", "Николаев Николай", "Петрова", "Русакова Ольга"};

	Person[] persons=getPerson(names);
	printPersons(persons);
    }

    public static Person[] getPerson(String[] names){
        Person[] persons=null;
        if(names!=null) {
            persons = new Person[names.length];
            for (int i = 0; i < names.length; i++) {
                String[] strings = names[i].split(" ");
                switch (strings.length){
                    case 1:
                        persons[i] = new Person(strings[0]);
                        break;
                    case 2:
                        persons[i] = new Person(strings[0], strings[1]);
                        break;
                    case 3:
                        persons[i] = new Person(strings[0], strings[1], strings[2]);
                        break;
                }
            }
        }
            return persons;
    }

    public static void printPersons(Person[] persons){
        for(Person person:persons){
            System.out.println(person.toShortNameString());
        }
    }


}
