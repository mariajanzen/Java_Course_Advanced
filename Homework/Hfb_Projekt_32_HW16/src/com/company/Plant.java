package com.company;

public abstract class Plant {


    public abstract int makeSpring();
    public abstract int makeSummer();
    public abstract int makeAutumn();
    public abstract int makeWinter();

    @Override
    public abstract String toString();

    public void printYear(Plant[] plants){
        for (Plant plant:plants) {
            System.out.println(plant.toString());
        }
    }
}
