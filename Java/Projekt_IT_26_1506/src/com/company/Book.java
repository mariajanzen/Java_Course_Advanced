package com.company;

public class Book {
    private Author[] authors;
    private String title;
    private String genre;
    private int id;

    public Book(Author author, String title, String genre, int id){
        this.authors =new Author[]{author};
        this.genre=genre;
        this.id=id;
        this.title=title;
    }
    public Book(Author[] authors, String title, String genre, int id){
        this.authors =authors;
        this.genre=genre;
        this.id=id;
        this.title=title;
    }
    public String toString(){
        return id+". \""+title+"\", " + authorsToString() +
                ", the genre is "+genre
                +".";
    }
    private String authorsToString(){
        String str="";
        for (int i=0; i<authors.length; ++i){
            str+=authors[i].toString()+(i!=authors.length-1?"/":"");
        }
        return str;
    }
    public String titleAndAuthorsToString(){
        return title+" ("+authorsToString()+");";
    }

    public Author[] getAuthors() {
        return authors;
    }
    public String getTitle(){
        return title;
    }
    public String getGenre(){
        return genre;
    }
    public int getID(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
}
