package com.twu.biblioteca;

import java.util.Scanner;
import com.twu.biblioteca.Library;
import java.util.Map;

public class Menu {
    private final Library library;
    private Scanner userInput;
    private Boolean status = false;

    public Menu(Library library, User currentUser) {
        this.library = library;
    }

    private void filterInputs(String userInput) {
        int userPick = Integer.parseInt(userInput);
        switch(userPick) {
            case 1 :
                getBooksListDetails();
                break;
            case 2 :
                getMoviesListDetails();
                break;
            case 3 :
                checkoutBook();
                break;
            case 4 :
                checkoutMovie();
                break;
            case 5 :
                returnBook();
                break;
            case 6 :
                returnMovie();
                break;
            case 7 :
                getCurrentUserDetails();
                break;
            case 8 :
                System.out.println(PrintHelper.QUIT);
                System.exit(0);
            default :
                System.out.println(PrintHelper.INVALID_OPTION);
        }
    }

    private void getBooksListDetails() {
        for (Book book : library.getBooks().values()) {
            if (!book.isCheckedOut()) {
                System.out.println( "Title: " + book.getTitle() + "\n" +
                                    "Author: " + book.getAuthor() + "\n" +
                                    "Year: " + book.getYearPublished() + "\n");
            }
        }
    }

    private void getMoviesListDetails() {
        for (Movie movie : library.getMovies().values()) {
            if (!movie.isCheckedOut()) {
                System.out.println( "Name: " + movie.getName() + "\n" +
                                    "Director: " + movie.getDirector() + "\n" +
                                    "Year: " + movie.getYearReleased() + "\n" +
                                    "Rating: " + movie.getRating() + "\n");
            }
        }
    }

    private void getCurrentUserDetails() {
        currentUser = library.getCurrentUser();
        System.out.println( "Name: " + currentUser.getName() + "\n" +
                            "Email: " + currentUser.getEmail() + "\n" +
                            "Phone: " + currentUser.getPhone() + "\n" +
                            "Library Number: " + currentUser.getLibraryNumber() + "\n" +
                            "Password: " + currentUser.getPassword() + "\n");
    }

    private Boolean checkoutBook() {
        System.out.println(PrintHelper.ASK_BOOK_TO_CHECKOUT);
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

    private Boolean checkoutMovie() {
        System.out.println(PrintHelper.ASK_MOVIE_TO_CHECKOUT);
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

    private Boolean returnMovie() {
        System.out.println(PrintHelper.ASK_MOVIE_TO_RETURN);
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

    private Boolean returnBook() {
        System.out.println(PrintHelper.ASK_BOOK_TO_RETURN);
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
