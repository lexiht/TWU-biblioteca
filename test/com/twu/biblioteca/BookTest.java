package com.twu.biblioteca;

import org.junit.Before;

public class BookTest {
    private Book book;

    @Before
    public void addBook() {
        book = new Book("The Art of Happiness", "Dalai Lama", "1998");
    }
}
