package com.company;

public class Main {

    public static void main(String[] args) {

        Circle c1=new Circle(10);
        Circle c2=new Circle(5);
        Square s1=new Square(2);
        Square s2=new Square(10);
        Rectangle r1=new Rectangle(2, 5);

        Shape[] shapes=new Shape[]{c1, c2, s1,s2,r1,
        new Rectangle(4,10)
        };

        for (Shape shape:shapes){
            System.out.println(shape);
        }

    }
}
