package com.company;

public class Rectangle extends Shape{
    private double shortSide;
    private double longSide;
    private double area;

    public Rectangle(double shortSide, double longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.area=shortSide*longSide;
    }
    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle: sides " + shortSide +
                " | " + longSide + ", area="+area();
    }

}
