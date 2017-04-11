package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BibliotecaAppTest {

    @Test
    public void shouldDefaultToNoUser() {
        assertEquals(null, BibliotecaApp.getCurrentUser());
    }

    @Test
    public void canStoreUserAfterLogin() {
        Library library = new Library();
        library.loginUser("222-2222", "lexi");
        assertNotNull(BibliotecaApp.getCurrentUser());
    }
}
