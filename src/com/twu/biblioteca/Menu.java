package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private com.twu.biblioteca.Library library;
    public Boolean status = false;

    public Menu(com.twu.biblioteca.Library library) {
        this.library = library;
    }

    public void getBooksListDetails() {
        for (Book book : library.getBooks().values()) {
            if (!book.isCheckedOut()) {
                System.out.println( "Title: " + book.getTitle() + "\n" +
                        "Author: " + book.getAuthor() + "\n" +
                        "Year: " + book.getYearPublished() + "\n");
            }
        }
    }

    public void getMoviesListDetails() {
        for (Movie movie : library.getMovies().values()) {
            if (!movie.isCheckedOut()) {
                System.out.println( "Name: " + movie.getName() + "\n" +
                        "Director: " + movie.getDirector() + "\n" +
                        "Year: " + movie.getYearReleased() + "\n" +
                        "Rating: " + movie.getRating() + "\n");
            }
        }
    }

    public void getCurrentUserDetails() {
        User currentUser = com.twu.biblioteca.BibliotecaApp.getCurrentUser();
        System.out.println( "Name: " + currentUser.getName() + "\n" +
                "Email: " + currentUser.getEmail() + "\n" +
                "Phone: " + currentUser.getPhone() + "\n" +
                "Library Number: " + currentUser.getLibraryNumber() + "\n" +
                "Password: " + currentUser.getPassword() + "\n");
    }

    public Boolean checkoutBook(String userInput) {
        for (Book book : library.getBooks().values()) {
            if (book.getTitle().equalsIgnoreCase(userInput)) {
                book.checkOut();
                status = true;
            }
        }
        return status;
    }

    public Boolean checkoutMovie(String userInput) {
        for (Movie movie : library.getMovies().values()) {
            if (movie.getName().equalsIgnoreCase(userInput)) {
                movie.checkOut();
                status = true;
            }
        }
        return status;
    }

    public Boolean returnMovie(String userInput ) {
        for (Movie movie : library.getMovies().values()) {
            if (movie.getName().equalsIgnoreCase(userInput)) {
                movie.returnMovie();
                status = true;
            }
        }
        return status;
    }

    public Boolean returnBook(String userInput) {
        for (Book book : library.getBooks().values()) {
            if (book.getTitle().equalsIgnoreCase(userInput)) {
                book.returnBook();
                status = true;
            }
        }
        return status;
    }
}
