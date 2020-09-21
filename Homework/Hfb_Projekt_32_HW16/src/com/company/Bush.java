package com.company;

public class Bush extends Plant{
    private int initialGrowth;
    private String name;

    public Bush(String name) {
        this.initialGrowth=40;
        this.name = name;
    }

    public int makeSpring(){
        return (initialGrowth+10);
    }

    public int makeSummer(){
        return makeSpring()+10;
    }

    public int makeAutumn(){
        return makeSummer()+3;
    }
    public int makeWinter(){
        return makeAutumn();
    }

    @Override
    public String toString() {
        return "The growth of bush " + name + " in a year will be: " + makeWinter()+"cm";
    }
}
