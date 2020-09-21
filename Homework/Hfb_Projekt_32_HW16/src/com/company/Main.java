package com.company;

public class Main {

    public static void main(String[] args) {

        Plant[] plants=new Plant[] {
                new Tree("oak"),
                new Tree("ash"),
                new Bush("lilac"),
                new Bush("hibiscus"),
                new Flower("rosa"),
                new Flower("geranium")
        };


       for (Plant plant:plants){
           System.out.println(plant.toString());;
       }
    }
}
