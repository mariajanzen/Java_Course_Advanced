package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person person1=new Person("Ivan", new PersonsAddress("Highway Street", 5));
        Person person2=new Person("Maria", new PersonsAddress("Clean Alley", 123));
        Person person3=new Person("Stephan", new PersonsAddress("Mackensy Way", 54));
        Person person4=new Person("John", new PersonsAddress("Bahnhofstraße", 67));
        Person person5=new Person("Amalia", new PersonsAddress("Beverly Hills", 114));
        Person person6=new Person("Rosa", new PersonsAddress("Rosemarin Street", 8));

        List<Person> people= new ArrayList<>(Arrays.asList(person1, person2, person3, person4, person5, person6));

        System.out.println(getAddresses(people).toString()); // HW Списки.1
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");

        List<String> personsNames=getNames(people);
        System.out.println(getNewListOfNamesNotFour(personsNames).toString()); // HW Списки.2

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");

        List<Integer> ints1=new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> ints2=new ArrayList<>(Arrays.asList(5,2,3,8));



        System.out.println(getDecisionToEqualsOfIntegers(ints1, ints2).toString()); // HW Списки.3
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");

        List<String> lettersToComparison1 = new LinkedList<>(Arrays.asList("aa", "bb","cc","dd"));
        List<String> lettersToComparison2 = new LinkedList<>(Arrays.asList("cc","dd","aa", "bb"));
        List<String> lettersToComparison3 = new LinkedList<>(Arrays.asList("dd","ee", "ff"));
        List<String> lettersToComparison4 = new LinkedList<>(Arrays.asList("dd","ff", "ee"));

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");
        Collections.reverse(ints1);             // HW Списки.5
        System.out.println(ints1);

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");
        List<Integer> getTwoListsInOne = new ArrayList<>(ints1.size()+ints2.size());
        getTwoListsInOne.addAll(ints1);
        getTwoListsInOne.addAll(ints2);
        System.out.println(getTwoListsInOne);   // HW Списки.6

        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println(getTheListWithoutSmallerThanInt(getTwoListsInOne, 3)); // HW Списки.7


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

    public static List<String> getDecisionToEqualsOfIntegers(List<Integer> ints1, List<Integer> ints2) {
        List<String> decisions = new ArrayList<>();
        String decisionYes = "Yes";
        String decisionNo = "No";
        for (int i=0; ints1.size()==ints2.size()?i<ints1.size():i<1; i++) {
            if (ints1.get(i).equals(ints2.get(i))) {
                decisions.add(decisionYes);
            }else{
                decisions.add(decisionNo);
            }
        }
        return decisions;
    }

   /* public static boolean isTheListACircleCopy(List<String> list1, List<String> list2){

            return false;
    }*/


    public static List<Integer> getTheListWithoutSmallerThanInt(List<Integer> listOfInts, int pointI) {
        List<Integer> resultList = new ArrayList<>(listOfInts.size());
        for (int i=0; i<listOfInts.size(); i++) {
            if (listOfInts.get(i)>=pointI){
                resultList.add(listOfInts.get(i));
            }
        }
        return resultList;
    }

}
