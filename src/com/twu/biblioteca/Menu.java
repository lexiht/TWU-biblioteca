package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private Library library;
    private Scanner userInput;
    private Boolean status = false;

    public Menu(Library library) {
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
        User currentUser = BibliotecaApp.getCurrentUser();
        System.out.println( "Name: " + currentUser.getName() + "\n" +
                            "Email: " + currentUser.getEmail() + "\n" +
                            "Phone: " + currentUser.getPhone() + "\n" +
                            "Library Number: " + currentUser.getLibraryNumber() + "\n" +
                            "Password: " + currentUser.getPassword() + "\n");
    }

    public Boolean checkoutBook() {
        userInput = new Scanner(System.in);
        String selectedBook = userInput.nextLine();

        for (Book book : library.getBooks().values()) {
            if (book.getTitle().equalsIgnoreCase(selectedBook)) {
                book.checkOut();
                status = true;
            }
        }
        return status;
    }

    public Boolean checkoutMovie() {
        userInput = new Scanner(System.in);
        String selectedMovie = userInput.nextLine();

        for (Movie movie : library.getMovies().values()) {
            if (movie.getName().equalsIgnoreCase(selectedMovie)) {
                movie.checkOut();
                status = true;
            }
        }
        return status;
    }

    public Boolean returnMovie() {
        userInput = new Scanner(System.in);
        String selectedMovie = userInput.nextLine();

        for (Movie movie : library.getMovies().values()) {
            if (movie.getName().equalsIgnoreCase(selectedMovie)) {
                movie.returnMovie();
                status = true;
            }
        }
        return status;
    }

    public Boolean returnBook() {
        userInput = new Scanner(System.in);
        String selectedBook = userInput.nextLine();

        for (Book book : library.getBooks().values()) {
            if (book.getTitle().equalsIgnoreCase(selectedBook)) {
                book.returnBook();
                status = true;
            }
        }
        return status;
    }
}
