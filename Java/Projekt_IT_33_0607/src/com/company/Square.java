package com.company;

public class Square extends Shape{
    private double side;
    private double area;

    public Square(double side) {
        this.side = side;
        this.area=side*side;
    }

    public double area(){
        return area;
    }

    @Override
    public String toString() {
        return "Square: side=" +
                side + " area = "+area();
    }
}
