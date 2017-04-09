package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    private Movie movie;

    @Before
    public void addMovie() {
        movie = new Movie("Guardian of the galaxy II", "James Smith", "2017", "5");
    }

    @Test
    public void shouldDefaultCheckoutFalse() {
        assertEquals(false, movie.isCheckedOut());
    }

    @Test
    public void shouldShowBookDetails() {
        assertEquals("Guardian of the galaxy II", movie.getName());
        assertEquals("James Smith", movie.getDirector());
        assertEquals("2017", movie.getYearReleased());
        assertEquals("5", movie.getRating());
    }

}
