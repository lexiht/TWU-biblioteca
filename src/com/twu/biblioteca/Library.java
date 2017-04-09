package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Library {
    private final HashMap<Integer, Book> books = new HashMap<Integer, Book>();
    private final HashMap<Integer, Movie> movies = new HashMap<Integer, Movie>();
    private final HashMap<Integer, User> users = new HashMap<Integer, User>();
    private Scanner userInput;
    private String userLibraryNumber;
    private String userPassword;
    private Menu menu;
    private User currentUser;

    public Library() {
        setupData();
        while (currentUser == null) {
            loginUser();
        }
        menu = new Menu(this);
    }

    private void setupData() {
        addBooks();
        addMovies();
        addUsers();
    }

    private void loginUser() {
        System.out.println(PrintHelper.WELCOME + PrintHelper.ASK_LIBRARY_NUMBER);
        userInput = new Scanner(System.in);
        userLibraryNumber = userInput.next();
        System.out.println(PrintHelper.ASK_PASSWORD);
        userPassword = userInput.next();

        for (User user : users.values()) {
            if (user.isUser(userLibraryNumber, userPassword)) {
                System.out.println(PrintHelper.LOGIN_SUCCESS);
                user.loggedIn = true;
                currentUser = user;
                break;
            } else {
                System.out.println(PrintHelper.LOGIN_ERROR);
            }
            break;
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
        users.put(1, new User("Ivan", "ivan@gmail.com", "0123456", "123-4567", "ivan"));
        users.put(2, new User("Lexi", "lexi@gmail.com", "0987654", "098-7654", "lexi"));
        users.put(3, new User("Stan", "stan@gmail.com", "1357909", "246-8024", "stan"));
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

