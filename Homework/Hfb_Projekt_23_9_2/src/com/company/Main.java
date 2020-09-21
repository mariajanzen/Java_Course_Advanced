package com.company;

public class Main {

    public static void main(String[] args) {
	String[] names={"Lera","Inna","Nick","Jack"};
        System.out.println(isTheName("Jack", names));
        System.out.println(isTheName("Vera", names));

        System.out.println(findName("Jack", names));

        int [] ints={4, 1, 124, 45, 63};
        System.out.println("---------");
        System.out.println(max(ints));
    }

    public static boolean isTheName(String name,String[] names){
        for (int i=0; i<names.length; i++){
            if (names[i].equals(name)){
                return true;
            }
        }
        return false;
    }

    public static int findName(String name, String [] names){
        for (int i=0; i<names.length; i++){
            if (names[i].equals(name)){
                return i;
            }
        }
        return -1;
    }

    public static int max(int[] ints){
        int max=ints[0];
        for (int i=0; i<ints.length; i++){
            if(max<ints[i]){
                max=ints[i];
            }else{
                max=max;
            }
        }
       return max;

    }
}
