package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Library {
    private final HashMap<Integer, Book> books = new HashMap<Integer, Book>();
    private final HashMap<Integer, Movie> movies = new HashMap<Integer, Movie>();
    private final HashMap<Integer, User> users = new HashMap<Integer, User>();
    private BibliotecaApp biblioteca;

    public Library() {
        setupData();
    }

    private void setupData() {
        addBooks();
        addMovies();
        addUsers();
    }

    public User loginUser(String libraryNumber, String password) {

        for (User user : users.values()) {
            if (user.isLoggedIn(libraryNumber, password)) {
                user.loggedIn = true;
                return user;
                break;
            }
        }
    }

    private void addBooks() {
        books.put(1, new Book("The heart of the sea", "Becky", "2017"));
        books.put(2, new Book("Til death do us part", "Max", "2010"));
        books.put(3, new Book("Hamlet", "James", "1765"));
        books.put(4, new Book("Someday", "Lex", "2015"));
    }

    private void addMovies() {
        movies.put(1, new Movie("The pursue of Happiness", "Smith", "2011", "4"));
        movies.put(2, new Movie("Die another day", "Jones", "2005", "3"));
        movies.put(3, new Movie("Saw I", "Bob", "2010", "5"));
        movies.put(4, new Movie("La la land", "Adam", "2017", "2"));
    }

    private void addUsers() {
        users.put(1, new User("Ivan", "ivan@gmail.com", "0123456", "111-1111", "ivan"));
        users.put(2, new User("Lexi", "lexi@gmail.com", "0987654", "222-2222", "lexi"));
        users.put(3, new User("Stan", "stan@gmail.com", "1357909", "333-3333", "stan"));
    }

    public HashMap<Integer, Book> getBooks() {
        return books;
    }

    public HashMap<Integer, Movie> getMovies() {
        return movies;
    }

    public User getCurrentUser() {
        return currentUser;
    }

}

