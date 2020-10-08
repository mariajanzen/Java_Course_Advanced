package com.company;

public enum Priority implements Comparable<Priority> {
    HIGH,
    NORMAL,
    LOW;

    public int getPrioritiesInNumbers(){
        if(this.equals(HIGH)){
            return 3;
        }else if(this.equals(NORMAL)){
            return 2;
        }else {
            return 1;
        }
    }
}
