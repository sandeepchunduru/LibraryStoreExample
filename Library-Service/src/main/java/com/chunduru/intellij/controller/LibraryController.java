package com.chunduru.intellij.controller;

import com.chunduru.dto.Book;
import com.chunduru.intellij.dao.LibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sande on 3/29/2017.
 */
@RestController
@RequestMapping(LibraryController.LIBRARY_BASE_URI)
public class LibraryController
{
    @Autowired
    LibraryDao libraryDao;

    public static final String LIBRARY_BASE_URI = "/library";

    @RequestMapping(value="/books/{bookId}")
    public Book getBookDetails(@PathVariable final int bookId)
    {
        Book book = new Book();
        book.setBookId(bookId);
        book.setBookTitle("Spring Rest API");
        book.setAuthorFirstName("Shashank");
        book.setAuthorLastName("Sagar");
        book.setBookRating(9);
        return book;
    }

    @RequestMapping(value= "/updateBookTitle/{bookId}")
    public void updateBookTitle(@PathVariable final String bookId)
    {
        String bookTitle = "Updated BookTitle";
        libraryDao.updateBookTitle(bookId, bookTitle);
    }

}
