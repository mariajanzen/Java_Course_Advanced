package com.company;

public class Tree extends Plant{
    private int initialGrowth;
    private String name;

    public Tree(String name) {
        this.initialGrowth=150;
        this.name = name;
    }

    public int makeSpring(){
        return (initialGrowth+15);
    }

    public int makeSummer(){
        return makeSpring()+15;
    }

    public int makeAutumn(){
        return makeSummer()+5;
    }
    public int makeWinter(){
        return makeAutumn()+5;
    }

    @Override
    public String toString() {
        return "The growth of tree " + name + " in a year will be: " + makeWinter()+"cm";
    }
}
