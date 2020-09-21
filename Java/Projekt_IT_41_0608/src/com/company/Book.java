package com.company;

public class Book implements Comparable<Book>{
    private String author;
    private String nameOfBook;

    public Book(String author, String nameOfBook) {
        this.author = author;
        this.nameOfBook = nameOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    @Override
    public int compareTo(Book book) {
        return this.author.compareTo(book.author);
    }

    @Override
    public String toString() {
        return "Book " + nameOfBook + ", the author is " + author;
    }


}
