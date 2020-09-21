package com.company;

public class BooksArray {
    private int size=0;
    private int capacity;
    private Book[] books=new Book[capacity];


    public BooksArray(int capacity) {
        this.capacity = capacity;
        books=new Book[capacity];
    }
    public BooksArray(Book[] books) {
        this.books = books;
    }

    public void add(Book book){
        if(size<capacity){
            books[size]=book;
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        String res="";
        for(int i=0; i<size; ++i){
            res+=books[i].toString()+'\n';
        }
        return res;
    }
    public void print(){
        System.out.println(this.toString());
    }

}
