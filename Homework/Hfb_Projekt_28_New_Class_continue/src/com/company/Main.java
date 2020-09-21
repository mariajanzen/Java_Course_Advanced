package com.company;

public class Main {

    public static void main(String[] args) {

        ChildrenBook book1=new ChildrenBook("The very hungry caterpillar", "picture book", 0, 7.69);
        ChildrenBook book2=new ChildrenBook("The Gruffalo", "bedtime story", 2, 7.19);
        ChildrenBook book3=new ChildrenBook("Hey Grandude!", "picture book", 2, 16.95);
        ChildrenBook book4=new ChildrenBook("Bob and the chicken", "picture book", 2, 4.29);

        Author authorName1=new Author("Eric Carle", "USA");
        Author authorName2=new Author("Julia Donaldson & Axel Scheffler", "USA/Germany");
        Author authorName3=new Author("Paul McCartney", "Great Britain");
        Author authorName4=new Author("Elnura Murzatayeva", "Russia");

        book1.author=authorName1;
        book2.author=authorName2;
        book3.author=authorName3;
        book4.author=authorName4;

        System.out.println("------print Children Books-------");
        ChildrenBook[] books=new ChildrenBook[]{book1, book2, book3, book4};
        for (int i=0; i<books.length; ++i){
            System.out.println((i+1)+")");
            books[i].print();
        }
    }
}
