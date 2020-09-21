package com.company;

public class Main {

    public static void main(String[] args) {
        String coffee=choice(2);
        print(coffee);
        System.out.println("----------");
        coffee=choice(5);
        print(coffee);


    }
    public static String choice(int coffeeType){
        String rez="error";
        switch (coffeeType){
            case 1: //espresso
                rez=coffeeMaker(0, 1, false) ? rez="espresso" : rez;
                break;
            case 2: //cappuccino
                rez=coffeeMaker(1, 2, true) ? rez="cappuccino" : rez;
                break;
            case 3: //milk coffee
                rez=coffeeMaker(0, 1, true) ? rez="milk coffee" : rez;
                break;
        }
        return rez;

    }

    public static boolean coffeeMaker(int water, int coffee, boolean milk){
        //make coffee
        return true;
    }

    public static void print(String coffeeString){
        if(coffeeString!="error"){
            System.out.println("Here is your " + coffeeString + "!");
        }else{
            System.out.print("something is wrong!");
        }
    }
}
