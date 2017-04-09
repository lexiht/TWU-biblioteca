package com.twu.biblioteca;

public class Movie {
    private String name;
    private String director;
    private String year;
    private String rating;
    private Boolean checkedOut;

    public Movie(String name, String director, String year, String rating) {
        name = name;
        director = director;
        year = year;
        rating = rating;
        checkedOut = false;
    }

    public Boolean isCheckedOut() {
        return checkedOut;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getYearReleased() {
        return year;
    }

    public String getRating() {
        return rating;
    }
}
