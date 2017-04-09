package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String year;
    private Boolean checkedOut;

    public Book(String title, String author, String year) {
        title = title;
        author = author;
        year = year;
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
        System.out.println(PrintHelper.CHECKOUT_BOOK);
        checkedOut = true;
    }

    public void returnBook() {
        System.out.println(PrintHelper.RETURN_BOOK);
        checkedOut = false;
    }
}
