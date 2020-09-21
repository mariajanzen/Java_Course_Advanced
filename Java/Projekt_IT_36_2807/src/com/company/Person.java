package com.company;

public class Person {
    private String name;
    private String surname;
    private String fathersName;

    public Person(String name, String surname, String fathersName) {
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
    }
    public Person(String name, String surname) {
        this(name, surname, "");
    }
    public Person(String name) {
        this(name, "","");
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getFathersName() {
        return fathersName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathersName='" + fathersName + '\'' +
                '}';
    }

    public String toShortNameString(){

        return "Person: "+name+" "+
                ((surname.length()>0)?surname.substring(0,1)+".":surname)+
                ((fathersName.length()>0)?fathersName.substring(0,1)+".":fathersName);
    }
}
