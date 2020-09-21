package com.company;

/*
7_1. Написать метод, который принимает строку и в качестве результата
возвращает строку, но в обратном порядке. Распечатать результат в main.
Пример: “Hello” -> “olleH”
 */
public class Main {

    public static void main(String[] args) {
        String str="hello! what about Java?";
        System.out.println(str);
        System.out.println(reversString(str));
    }

    // 7_1
    public static String reversString(String str) {
        String res="";
        for (int i = str.length()-1; i>=0; i--) {
            res+=str.charAt(i);
        }
    return res;
    }
}
