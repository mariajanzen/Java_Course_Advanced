package com.company;

import java.util.Arrays;

public class StringsArrayHandle {
    private String[] strings;
    private Action action;
    private Condition condition;

    public StringsArrayHandle(String[] strings, Action action, Condition condition) {
        this.strings = strings;
        this.action = action;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    public void stringsHandle(){
        for(int i=0; i< strings.length; i++){
            if(condition.test(strings[i])){
                strings[i]=action.doAction(strings[i]);
            }
        }
    }
}
