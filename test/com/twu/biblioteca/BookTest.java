package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void addBook() {
        book = new Book("The Art of Happiness", "Dalai Lama", "1998");
    }

    @Test
    public void shouldDefaultCheckoutFalse() {
        assertEquals(false, book.isCheckedOut());
    }

    @Test
    public void canShowTitle() {
        assertEquals("The Art of Happiness", book.getTitle());
    }

    @Test
    public void canShowAuthor() {
        assertEquals("Dalai Lama", book.getAuthor());
    }

    @Test
    public void canShowYearOfPublished() {
        assertEquals("1998", book.getYearPublished());
    }

    @Test
    public void canCheckoutBook() {
        book.checkOut();
        assertEquals(true, book.isCheckedOut());
        // test print out message
    }

    @Test
    public void canReturnBook() {
        book.checkOut();
        book.returnBook();
        assertEquals(false, book.isCheckedOut());
    }
}
