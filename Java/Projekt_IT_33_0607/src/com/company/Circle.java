package com.company;

public class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area=Math.PI*radius*radius;
    }

    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Square: radius=" +
                radius + " area = "+area();
    }
}
