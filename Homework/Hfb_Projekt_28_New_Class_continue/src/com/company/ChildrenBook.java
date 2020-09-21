package com.company;

public class ChildrenBook {
    String title;
    String genre;
    int ageOrientation;
    double price;
    Author author;

    public ChildrenBook(String title, String genre, int ageOrientation, double price){
        this.title=title;
        this.ageOrientation=ageOrientation;
        this.genre=genre;
        this.price=price;
    }

    public void print(){
        System.out.println("The book is: "+this.title+
                ". The price is: "+this.price+
                ". The book is written as "+this.genre+
                ". It's oriented on the children from "+
                this.ageOrientation+". ");
        if(author!=null){
            System.out.println("The author is: "+author.getTheAuthor());
        }
    }

    public double getThePriceDifference(double price1, double price2){
        return price1-price2;
    }


}
