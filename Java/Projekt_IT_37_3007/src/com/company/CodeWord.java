package com.company;

public class CodeWord {
    private int value;

    public CodeWord(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "CodeWord{" +
                "value=" + value +
                '}';
    }
}
