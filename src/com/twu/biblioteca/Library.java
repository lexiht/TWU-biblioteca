package com.twu.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Movie> movies;
    private ArrayList<User> users;

    public void addBooks() {
        books = new ArrayList<Book>() {{
            add(new Book("The heart of the sea", "Becky", "2017"));
            add(new Book("Til death do us part", "Max", "2010"));
            add(new Book("Hamlet", "James", "1765"));
            add(new Book("Someday", "Lex", "2015"));
        }};
    }

    public void addMovies() {
        movies = new ArrayList<Movie>() {{
            add(new Movie("The pursue of Happiness", "Smith", "2011", "4"));
            add(new Movie("Die another day", "Jones", "2005", "3"));
            add(new Movie("Saw I", "Bob", "2010", "5"));
            add(new Movie("La la land", "Adam", "2017", "2"));
        }};
    }

    public void addUsers() {
        users = new ArrayList<User>() {{
            add(new User("Ivan", "ivan@gmail.com", "0123456", "123-4567", "ivan"));
            add(new User("Lexi", "lexi@gmail.com", "0987654", "098-7654", "lexi"));
            add(new User("Stan", "stan@gmail.com", "1357909", "246-8024", "stan"));
        }};
    }
}

