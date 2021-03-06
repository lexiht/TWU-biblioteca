package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library = new Library();
    private final HashMap<Integer, User> users = new HashMap<Integer, User>();
    private final HashMap<Integer, Book> books = new HashMap<Integer, Book>();
    private final HashMap<Integer, Movie> movies = new HashMap<Integer, Movie>();
    private User user;

    @Before
    public void setupData() {
        user = new User("Ivan", "ivan@gmail.com", "0123456", "111-1111", "ivan");
        movies.put(1, new Movie("The pursue of Happiness", "Smith", "2011", "4"));
        users.put(1, user );
        books.put(1, new Book("The heart of the sea", "Becky", "2017"));
    }

    @Test
    public void canLoginUser() {
        assertEquals(user, library.loginUser("111-1111", "ivan"));
    }

    @Test
    public void canGetBooksDetails() {
        assertEquals(books, library.getBooks());
    }

    @Test
    public void canGetMovieDetails() {
        assertEquals(movies, library.getMovies());
    }
}
