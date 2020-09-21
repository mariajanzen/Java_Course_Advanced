package com.company;

public class Flower extends Plant{
    private int initialGrowth;
    private String name;

    public Flower(String name) {
        this.initialGrowth = 0;
        this.name = name;
    }

    public int makeSpring(){
        return (initialGrowth+20);
    }

    public int makeSummer(){
        return makeSpring()+10;
    }

    public int makeAutumn(){
        return makeSummer();
    }
    public int makeWinter(){
        return 0;
    }

    @Override
    public String toString() {
        return "The growth of flower " + name + " in a year will be: " + makeWinter()+"cm";
    }
}
