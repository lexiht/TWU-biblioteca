package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Menu menu;
        User currentUser = null;
        Scanner userInput = new Scanner(System.in);
        String libraryNumber = "";
        String password = "";
        Boolean status = false;
        String menuOptions = "Choose an option:\n" +
                "1 - Books List \n" +
                "2 - Movies List \n" +
                "3 - Checkout Book \n" +
                "4 - Checkout Movie \n" +
                "5 - Return Book \n" +
                "6 - Return Movie \n" +
                "7 - User Information \n" +
                "8 - Quit \n";

        Library library = new Library();
        while (currentUser == null) {
            getCredential(userInput, libraryNumber, password);
            currentUser = library.loginUser(libraryNumber, password);
            if (currentUser == null) {
                System.out.println("Incorrect library number or password");
            }
        }
        System.out.println("Login successful, welcome back!");

        menu = new Menu(library, currentUser);

        do {
            getMenuOptions(menuOptions, userInput);
        } while (true);
    }

    private static void getCredential(Scanner userInput, String userLibraryNumber, String userPassword) {
        System.out.println("Please login before proceed. Type your library number: ");
        userLibraryNumber = userInput.nextLine();
        System.out.println("Type your password: ");
        userPassword = userInput.next();
    }

    private static void getMenuOptions(String menu, Scanner userInput) {
        String selectedOption;

        System.out.println(menu);
        userInput = new Scanner(System.in);
        selectedOption = userInput.nextLine();
        menu.filterInputs(selectedOption);
    }

    private static HashMap<String, ArrayList<String>> messageList = new HashMap<String, ArrayList<String>>(){{
        put("checkout book", CHECKOUT_BOOK);
        put("checkout movie", CHECKOUT_MOVIE);
        put("return book", RETURN_BOOK);
        put("return movie", RETURN_MOVIE);
    }};

    private static final ArrayList<String> CHECKOUT_BOOK = new ArrayList<String>(){{
        add("Thank you! Enjoy the book");
        add("This book is not available");
    }};

    private static final ArrayList<String> CHECKOUT_MOVIE = new ArrayList<String>(){{
        add("Thank you! Enjoy the movie");
        add("This movie is not available");
    }};

    private static final ArrayList<String> RETURN_BOOK = new ArrayList<String>(){{
        add("Thank you for returning the book");
        add("This is not a valid book to return");
    }};


    private static final ArrayList<String> RETURN_MOVIE = new ArrayList<String>(){{
        add("Thank you for returning the movie");
        add("This is not a valid movie to return");
    }};

    private static void print(Boolean status, String typeOfMessages) {
        switch (typeOfMessages) {
            case "checkout book" :
                selectMessage(status, typeOfMessages);
                break;
            case "checkout movie" :
                selectMessage(status, typeOfMessages);
                break;
            case "return book" :
                selectMessage(status, typeOfMessages);
                break;
            case "return movie" :
                selectMessage(status, typeOfMessages);
                break;
        }
    }

    private static void selectMessage(Boolean status, String typeOfMessages) {
        if (status == true) {
            System.out.println(messageList.get(typeOfMessages).get(0));
        } else {
            System.out.println(messageList.get(typeOfMessages).get(1));
        }
    }

}
