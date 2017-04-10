package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String year;
    private Boolean checkedOut;

    public Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
        checkedOut = false;
    }

    public Boolean isCheckedOut() {
        return checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearPublished() {
        return year;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void returnBook() {
        checkedOut = false;
    }
}
