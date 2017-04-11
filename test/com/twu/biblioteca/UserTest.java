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

    @Test
    public void shouldShowUserName() {
        assertEquals("Lexi", user.getName());
    }

    @Test
    public void shouldShowUserEmail() {
        assertEquals("lexi@gmail.com", user.getEmail());
    }

    @Test
    public void shouldShowUserPhone() {
        assertEquals("123456789", user.getPhone());
    }

    @Test
    public void shouldShowUserLibraryNumber() {
        assertEquals("123-4567", user.getLibraryNumber());
    }

    @Test
    public void shouldShowUserPassword() {
        assertEquals("lexi", user.getPassword());
    }


}





