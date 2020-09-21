package com.company;

public class Author {
    String authorName;
    String country;

    public Author(String author, String country){
        this.authorName=author;
        this.country=country;
    }

    public String getTheAuthor(){
        return authorName+", "+country+".";
    }
}
