package com.company;

public class StringDemo {
    public static void main(String[] args){
        char[] ch={'h', 'e', 'l', 'ä'};
        String s="hello Java";
        String s1=new String("Hello");
        String s2= new String(ch);
        System.out.println(s2);
        for (char c:ch){
            System.out.println(c);
        }
        char[] chars=s1.toCharArray();


        System.out.println(s.compareTo(s1));
        String newString=s.substring(0, 3);
        System.out.println(newString);


    }
}
