package com.twu.biblioteca;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class User {
    private String name;
    private String email;
    private String phone;
    private String libraryNumber;
    private String password;
    public Boolean loggedIn = false;

    public User(String name, String email, String phone, String libraryNumber, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.libraryNumber = libraryNumber;
        this.password = password;
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


    public Boolean isUser(String libraryNumber, String password) {
        return getLibraryNumber().equals(libraryNumber) && getPassword().equals(password);
    }
}

