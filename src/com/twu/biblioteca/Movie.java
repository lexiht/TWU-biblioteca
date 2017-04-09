package com.twu.biblioteca;

public class Movie {
    private String name;
    private String director;
    private String year;
    private String rating;
    private Boolean checkedOut;

    public Movie(String name, String director, String year, String rating) {
        this.name = name;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.checkedOut = false;
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

    public void checkOut() {
        System.out.println(PrintHelper.CHECKOUT_MOVIE);
        checkedOut = true;
    }

    public void returnMovie() {
        System.out.println(PrintHelper.RETURN_MOVIE);
        checkedOut = false;
    }
}
