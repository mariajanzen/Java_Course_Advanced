package com.company;

public class Main {

    public static void main(String[] args) {
        String str="20*()((876/8)+19)";
        System.out.println(areBracketsOk(str));

    }

    public static boolean areBracketsOk(String str){
        int i=0;
        int bracketsCounter = 0;
        while (i<str.length() && bracketsCounter>=0){
            char ch=str.charAt(i);
            if (ch=='('){
                bracketsCounter=bracketsCounter+1;
            }
            if (ch==')'){
                bracketsCounter=bracketsCounter-1;
            }
            i++;
        }
       return bracketsCounter==0;
    }
}
