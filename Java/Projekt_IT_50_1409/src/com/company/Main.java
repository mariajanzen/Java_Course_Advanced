package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        List <String> listOfString = new ArrayList <>();
        listOfString.add("Olga");
        listOfString.add("Maria");
        listOfString.add("Jack");
        listOfString.add("Iwan");
        listOfString.add("Olga");
        listOfString.add("Jack");
        listOfString.add("Maria");
        listOfString.add("Gregor");

        System.out.println(getMapOfStrings(listOfString).toString());

    }



    public static Map <String, Integer> getMapOfStrings(List<String> list){
        Map<String, Integer> result=new HashMap <>();
        if(list ==null) return result;
        for(String str:list){
            if(result.containsKey(str)){
                result.put(str, result.get(str)+1);
            }else{
                result.put(str, 1);
            }
        }

        return result;
    }
}
