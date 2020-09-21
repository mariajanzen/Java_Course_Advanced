package com.company;
/*
 char
 String.length()
 String.charAt()
 */
public class Main {

    public static void main(String[] args) {
        String str="Привет Джава!";
        printStringVertical2(str);
        printABC();
        String r=toUpperCase(str);
        System.out.println(r);


        // char example
        char c1 = 1045;
        char c2=(char)1512;
        char c3='\u05E8';



    }
    public static void printStringVertical(String str){

        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void printStringVertical2(String str){

        for (int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' ') {
                System.out.println(str.charAt(i));

            }
        }
    }

    public static void printABC(){
        for (int i=1040;i<1072; i++){
            System.out.print((char)i);
            if(i==1045){
                System.out.print((char)1025);
            }
        }
        System.out.println();
    }

    public static String toUpperCase(String s){
        //"Привет" -> "ПРИВЕТ";
        String rez="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>=1072&&c<=1103){
                c=(char)(c-32);
            }
            if(c==1105){
                c=(char)(c-80);
            }

            rez=rez+c;
        }
        return rez;
    }
}
/*
    11987 - 11987%10 ->7
    11987/10 ->1198 % 10 ->8
    1198/10 -> 119 % 10 ->9
 */