package com.company;

public class ChildrenBook {
    String title;
    String genre;
    String author;
    int ageOrientation;
    double price;

    public String getAuthor(){
        return "The Author is: "+author;
    }

    public String getTitle(){
        return "The Title of this book is: "+title;
    }

    public String getGenre(){
        return "The book is written as "+genre;
    }

    public double getPrice(){
        return price;
    }

    public int getAge(){
        return ageOrientation;
    }

    public String getTheDescription(){
        return getAuthor()+". "+getTitle()+". " +getGenre()+
                ". " +"This book costs " +getPrice()+
                ". And the book is oriented on the children from "+
                ageOrientation+" years old.";
    }

    public double getThePriceDifference(double price1, double price2){
        return price1-price2;
    }


}
