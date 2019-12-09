package com.company.interfaces;


import com.company.Book;

import java.util.ArrayList;
import java.util.List;

public interface BooksListHelper {
    void addBook(Book book);
    List<Book> getBooks();
}
