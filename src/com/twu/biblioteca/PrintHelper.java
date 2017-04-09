package com.twu.biblioteca;

import org.omg.CORBA.PUBLIC_MEMBER;

public final class PrintHelper {
    public static final String WELCOME = "Please login before proceed.";
    public static final String ASK_LIBRARY_NUMBER = "Type your library number:";
    public static final String ASK_PASSWORD = "Type your password:";
    public static final String MENU_OPTIONS = "Choose an option:\n" +
            "1 - Books List \n" +
            "2 - Movies List \n" +
            "3 - Checkout Book \n" +
            "4 - Checkout Movie \n" +
            "5 - Return Book \n" +
            "6 - Return Movie \n" +
            "7 - User Information \n" +
            "8 - Quit \n";
    public static final String INVALID_OPTION = "Invalid option! Please choose again from the option list.";
    public static final String ASK_BOOK_TO_CHECKOUT = "Type the title of the book you want to checkout:";
    public static final String CHECKOUT_BOOK = "Thank you! Enjoy the book";
    public static final String CHECKOUT_BOOK_ERROR = "This book is not available";
    public static final String RETURN_BOOK = "Thank you for returning the book";
    public static final String RETURN_BOOK_ERROR = "This is not a valid book to return";

    public static final String ASK_MOVIE_TO_CHECKOUT = "Type the name of the movie you want to checkout:";
    public static final String CHECKOUT_MOVIE = "Thank you! Enjoy the movie";
    public static final String CHECKOUT_MOVIE_ERROR = "This movie is not available";
    public static final String RETURN_MOVIE = "Thank you for returning the movie";
    public static final String RETURN_MOVIE_ERROR = "This is not a valid movie to return";

    public static final String LOGIN_SUCCESS = "Login successful, welcome back!";
    public static final String LOGIN_ERROR = "Incorrect library number or password";
    public static final String QUIT = "See you next time!";
}
