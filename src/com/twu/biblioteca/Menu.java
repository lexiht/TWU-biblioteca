package com.twu.biblioteca;

import java.util.Scanner;
import com.twu.biblioteca.Library;
import java.util.Map;

public class Menu {
    private final Library library;
    private User currentUser;
    private Scanner userInput;

    public Menu(Library library) {
        this.library = library;
        String selectedOption;
        do {
            System.out.println(PrintHelper.MENU_OPTIONS);
            userInput = new Scanner(System.in);
            selectedOption = userInput.next();
            filterInputs(selectedOption);
        } while (true);
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
                System.out.println( book.getTitle() + "\n" +
                                    book.getAuthor() + "\n" +
                                    book.getYearPublished() + "\n");
            }
        }
    }

    private void getMoviesListDetails() {
        for (Movie movie : library.getMovies().values()) {
            if (!movie.isCheckedOut()) {
                System.out.println( movie.getName() + "\n" +
                                    movie.getDirector() + "\n" +
                                    movie.getYearReleased() + "\n" +
                                    movie.getRating() + "\n");
            }
        }
    }

    private void getCurrentUserDetails() {
        currentUser = library.getCurrentUser();
        System.out.println( currentUser.getName() + "\n" +
                            currentUser.getEmail() + "\n" +
                            currentUser.getPhone() + "\n" +
                            currentUser.getLibraryNumber() + "\n" +
                            currentUser.getPassword() + "\n");
    }

    private void checkoutBook() {
        System.out.println(PrintHelper.ASK_BOOK_TO_CHECKOUT);
        userInput = new Scanner(System.in);
        String selectedBook = userInput.nextLine();
        System.out.println(selectedBook);

        library.getBooks().values().stream()
                .filter(book -> book.getTitle().equalsIgnoreCase(selectedBook))
                .findFirst().get();

//            if (book.getTitle().equalsIgnoreCase(selectedBook)) {
//                book.checkOut();
//            } else {
//                System.out.println(PrintHelper.CHECKOUT_BOOK_ERROR);
//            }
    }

    private void checkoutMovie() {
        // same problem as above
        System.out.println(PrintHelper.ASK_MOVIE_TO_CHECKOUT);
        userInput = new Scanner(System.in);
        String selectedMovie = userInput.next();

        for (Movie movie : library.getMovies().values()) {
            if (movie.getName().equalsIgnoreCase(selectedMovie)) {
                movie.checkOut();
            } else {
                System.out.println(PrintHelper.CHECKOUT_MOVIE_ERROR);
            }
        }
    }

//    private void returnMovie() {
//        // same problem as above
//        System.out.println(PrintHelper.ASK_MOVIE_TO_CHECKOUT);
//        userInput = new Scanner(System.in);
//        String selectedMovie = userInput.next();
//
//        for (Movie movie : library.getMovies().values()) {
//            if (movie.getName().equalsIgnoreCase(selectedMovie)) {
//                movie.checkOut();
//            } else {
//                System.out.println(PrintHelper.CHECKOUT_MOVIE_ERROR);
//            }
//            break;
//        }
//    }
}
