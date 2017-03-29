package com.chunduru.dto;

/**
 * Created by sande on 3/29/2017.
 */
public class Book
{
    private int bookId;
    private String bookTitle;
    private String authorLastName;
    private String authorFirstName;
    private int bookRating;

    public Book()
    {

    }

    public Book(int bookId, String bookTitle, String authorLastName, String authorFirstName, int bookRating)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.bookRating = bookRating;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public int getBookRating() {
        return bookRating;
    }

    public void setBookRating(int bookRating) {
        this.bookRating = bookRating;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", bookRating=" + bookRating +
                '}';
    }
}
