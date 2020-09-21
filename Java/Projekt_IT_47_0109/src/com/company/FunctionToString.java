package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FunctionToString implements BiFunction<List<String>, Predicate<String>, List<String>>{

    @Override
    public List <String> apply(List <String> strings, Predicate <String> predicate) {
        List<String> res=new ArrayList <>();
        if(strings == null) return res;
        for(String s:strings){
            if(predicate.test(s)){
                res.add(s);
            }
        }
        return res;
    }


   /* private Predicate predicate;

    @Override
    public List <String> apply(List <String> strings) {
        List<String> res=new ArrayList <>();
        if(strings == null) return res;
        for(String s:strings){
            if(predicate.test(s)){
                res.add(s);
            }
        }
        return res;
    }

    public FunctionToString(Predicate predicate) {
        this.predicate = predicate;
    }*/


        }