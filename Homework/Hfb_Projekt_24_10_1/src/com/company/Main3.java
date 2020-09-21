package com.company;

public class Main3 {

    public static void main(String[] args) {
        //10_6
        String[] names={"Olga","Oleg","Irina","Jack"};
        int[] years={2004,1982,2008,1993};
        int[] age=getAgeInInts(years);
        print(names, age, 20);
        System.out.println("--------");
        printOldest(names, age);

    }

    public static int[] getAgeInInts(int[] years){

        int[] age=new int[years.length];
        for(int i=0; i<years.length; ++i){
            age[i]=2020-years[i];
        }
        return age;
    }

    public static void print(String[] str, int[] ints, int age){

        for(int i=0; i<ints.length;++i){
            if (age<ints[i]){
                System.out.println(str[i]+" "+ints[i]+" years old");
            }
        }
    }

    public static void printOldest(String[] str, int[] ints){
        int max=ints[0];
        int indexmax=0;
        for(int i=0; i<ints.length;++i){
            if (max<ints[i]){
                max=ints[i];
                indexmax=i;
                System.out.println(str[indexmax]+" "+max+" years is oldest.");
            }
        }
    }

}
