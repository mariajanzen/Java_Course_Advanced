package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static <Iterator> void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("str1");
        list.add("qstr2");
        list.add("qstr3");
        list.add("str4");
        list.add("qstr5");
        list.add("str6");

        System.out.println(list);

     /*   for(int i=0; i<list.size(); i++){
            if(list.get(i).startsWith("q")){
                list.remove(i);
                i--;
            }
        }

        for(String s: list){
            if(s.startsWith("q")){
                list.remove(s);
            }
        }
        java.util.Iterator <String> iterator=list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("q")){
                iterator.remove();
            }
        }*/
        Predicate<String> predicate=new ConditionForRemove();
        list.removeIf(predicate);

     


        System.out.println("--------remove--------");
        System.out.println(list);
    }
}
