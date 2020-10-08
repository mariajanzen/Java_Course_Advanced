package com.company;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Anagram {
    private Map<String, List<String>> map;

    public Anagram(List<String> voc) {
        map=buildMap(voc);
    }
    public static List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "annna");
    // vocabulary = {"anna", "ivan", "naan", "vani", "piotr", "navi", "annna"};


    public List<String> getAnagram(String word){
        String sortedWord = sortWord(word);
        return map.get(sortedWord);

        /*List<String> res = new ArrayList<>();
        for(String w:VOC){
            if(sortWord(w).equals(sortWord(word))){
                res.add(w);
            }
        }
        return res;*/
    }

    private Map<String, List<String>> buildMap(List<String> voc){
        Map<String, List<String>> ret = new HashMap<>();
        for(String w:voc){
            String sortedWord = sortWord(w);
            List<String> list = ret.get(sortedWord);
            if(list == null) {
                list = new ArrayList<>();
                list.add(w);
                ret.put(sortedWord, list);
            }else{
                list.add(w);
            }
        }
        return ret;
    }

    private String sortWord(String word){
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}
