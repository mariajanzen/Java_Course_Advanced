package com.company;

public class Main {

    public static void main(String[] args) {
        Author author1=new Author("O Henry");
        Author author2=new Author("Somerset", "Maugham");
        Author author3=new Author("Kathy Sierra");
        Author author4=new Author("Bert", "Beyts");
        Author[] authors=new Author[]{author3, author4};
        Book book1=new Book(author1, "Best short stories", "roman", 234567);
        Book book2=new Book(new Author("Robert Martin"), "Clean code", "study", 123456);
        Book book3=new Book(new Author("J.D. Salinger"), "A perfect day for Bananafish", "roman", 345678);
        Book book4=new Book(author2, "Theatre", "roman", 456789);
        Book book5=new Book(authors, "Learning Java", "study", 34456);
        Book[] books=new Book[]{book1, book2, book3, book4, book5};

        System.out.println("-------------");
        BooksArray booksArray=new BooksArray(books);
        booksArray.print();

        System.out.println("--------");
        BooksArray booksArray1=new BooksArray((100));
        booksArray1.add(book1);
        booksArray1.print();
        booksArray1.add(book3);
        booksArray1.print();
    }

   /* public static void printBooks(Book[] books){
        for (int i=0; i<books.length; ++i){
            System.out.println(books[i].toString());
        }
    }
    public static void printTitleBooks(Book[] books){
        for (int i=0; i<books.length; ++i){
            System.out.println(books[i].titleAndAuthorsToString());
        }
    }*/
}
