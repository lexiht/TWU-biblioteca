package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private User user;

    @Before
    public void addUser() {
        user = new User("Lexi", "lexi@gmail.com", "123456789", "123-4567", "lexi" );
    }

//    @Test
//    public void shouldSuccessfullyLogin() {
//        String libraryNumber = user.getLibraryNumber();
//        String password = user.getPassword();
//        user.login(libraryNumber, password);
//        assertEquals(true, user.isLoggedIn());
//        // test successful message
//    }
//
//    @Test
//    public void shouldLoginUnsuccessfully() {
//        String libraryNumber = "234-5678";
//        String password = "lexy";
//        user.login(libraryNumber, password);
//        assertEquals(false, user.isLoggedIn());
//        // test error message
//    }

    @Test
    public void shouldUserDetails() {
        assertEquals("Lexi", user.getName());
        assertEquals("lexi@gmail.com", user.getEmail());
        assertEquals("123456789", user.getPhone());
        assertEquals("123-4567", user.getLibraryNumber());
        assertEquals("lexi", user.getPassword());
    }
}





