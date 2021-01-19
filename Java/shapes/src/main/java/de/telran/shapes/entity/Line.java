package de.telran.shapes.entity;

import java.util.Arrays;

public class Line extends Shape {
    private int length;


    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    @Override
    public void draw() {
        char[] chars = new char[length];
        Arrays.fill(chars, symbol);

        System.out.println(new String(chars));
    }
}
