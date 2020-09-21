package com.company;

public class Main {

    public static void main(String[] args) {

        ChildrenBook book1=new ChildrenBook();
        book1.title="The very hungry caterpillar";
        book1.ageOrientation=0;
        book1.author="Eric Carle";
        book1.genre="picture book";
        book1.price=7.69;

        ChildrenBook book2=new ChildrenBook();
        book2.title="The Gruffalo";
        book2.author="Julia Donaldson & Axel Scheffler";
        book2.genre="bedtime story";
        book2.price=7.19;
        book2.ageOrientation=2;

        ChildrenBook book3=new ChildrenBook();
        book3.title="Hey Grandude!";
        book3.author="Paul McCartney";
        book3.genre="picture book";
        book3.price=16.95;
        book3.ageOrientation=2;

        ChildrenBook[] books={book1, book2, book3};
        for(int i=0; i<books.length; ++i){
            System.out.println(books[i].getTheDescription());
        }


    }
}
