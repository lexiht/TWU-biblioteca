package com.twu.biblioteca;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class User {
    private String name;
    private String email;
    private String phone;
    private String libraryNumber;
    private String password;
    private Boolean loggedIn = false;

    public User(String name, String email, String phone, String libraryNumber, String password) {
        name = name;
        email = email;
        phone = phone;
        libraryNumber = libraryNumber;
        password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public Boolean isLoggedIn() {
        return loggedIn;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void login(String libraryNumber, String password) {
        if (authenticateUser(libraryNumber, password)) {
            System.out.println(PrintHelper.LOGIN_SUCCESS);
            loggedIn = true;
        } else {
            System.out.println(PrintHelper.LOGIN_ERROR);
        }
    }

    private Boolean authenticateUser(String libraryNumber, String password) {
        return libraryNumber.equals(libraryNumber) && password.equals(password);
    }
}

