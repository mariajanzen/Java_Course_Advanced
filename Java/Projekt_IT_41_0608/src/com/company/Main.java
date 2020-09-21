package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Book[] books={new Book("William Shakespeare", "Romeo and Juliette"),
                     new Book("Charles Dickens", "Oliver Twist"),
                  new Book("Mark Twain", "Tom Sawyer"),
                new Book("Agatha Christie", "Miss Marple")};


        for(Book book:books){
            System.out.println(book);
        }
        Arrays.sort(books);
        System.out.println(Arrays.toString(books));


    }
}
