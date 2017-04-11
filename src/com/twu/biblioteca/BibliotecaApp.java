package com.twu.biblioteca;

import com.sun.xml.internal.fastinfoset.sax.SystemIdResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BibliotecaApp {

    private static User currentUser = null;
    private static Menu menu;
    private static Scanner userInput = new Scanner(System.in);
    private static String libraryNumber;
    private static String password;

    public static void main(String[] args) {
        Library library = new Library();
        while (currentUser == null) {
            getCredential();
            currentUser = library.loginUser(libraryNumber, password);
            if (currentUser == null) {
                System.out.println("Incorrect library number or password");
            }
        }
        System.out.println("Login successful, welcome back!");

        menu = new Menu(library);

        do {
            getMenuOptions();
        } while (true);
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    private static void getCredential() {
        System.out.println("Please login before proceed. Type your library number: ");
        libraryNumber = userInput.nextLine();
        System.out.println("Type your password: ");
        password = userInput.nextLine();
    }

    private static void getMenuOptions() {
        String menuOptions = "Choose an option:\n" +
                "1 - Books List \n" +
                "2 - Movies List \n" +
                "3 - Checkout Book \n" +
                "4 - Checkout Movie \n" +
                "5 - Return Book \n" +
                "6 - Return Movie \n" +
                "7 - User Information \n" +
                "8 - Quit \n";

        System.out.println(menuOptions);
        String selectedOption = userInput.nextLine();
        filterInputs(selectedOption);
    }

    private static void filterInputs(String userInput) {
        int userPick = Integer.parseInt(userInput);
        switch(userPick) {
            case 1 :
                menu.getBooksListDetails();
                break;
            case 2 :
                menu.getMoviesListDetails();
                break;
            case 3 :
                System.out.println("Type the title of the book you want to checkout:");
               print(menu.checkoutBook(), "checkout book");
                break;
            case 4 :
                System.out.println("Type the name of the movie you want to checkout:");
                print(menu.checkoutMovie(), "checkout movie");
                break;
            case 5 :
                System.out.println("Type the title of the book you want to return");
                print(menu.returnBook(), "return book");
                break;
            case 6 :
                System.out.println("Type the title of the movie you want to return");
                print(menu.returnMovie(), "return movie");
                break;
            case 7 :
                menu.getCurrentUserDetails();
                break;
            case 8 :
                System.out.println("See you next time!");
                System.exit(0);
            default :
                System.out.println("Invalid option! Please choose again from the option list.");
        }
    }

    private static HashMap<String, ArrayList<String>> messageList = new HashMap<String, ArrayList<String>>(){{
        put("checkout book", checkBookMessages);
        put("checkout movie", checkMovieMessages);
        put("return book", returnBookMessages);
        put("return movie", returnMovieMessages);
    }};

    private static ArrayList<String> checkBookMessages = new ArrayList<String>(){{
        add("Thank you! Enjoy the book");
        add("This book is not available");
    }};

    private static ArrayList<String> checkMovieMessages = new ArrayList<String>(){{
        add("Thank you! Enjoy the movie");
        add("This movie is not available");
    }};

    private static ArrayList<String> returnBookMessages = new ArrayList<String>(){{
        add("Thank you for returning the book");
        add("This is not a valid book to return");
    }};


    private static ArrayList<String> returnMovieMessages = new ArrayList<String>(){{
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
        if (status) {
            System.out.println(messageList.get(typeOfMessages).get(0));
        } else {
            System.out.println(messageList.get(typeOfMessages).get(1));
        }
    }

}
