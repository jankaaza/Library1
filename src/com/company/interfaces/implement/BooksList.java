package com.company.interfaces.implement;

import com.company.interfaces.BooksListHelper;

import com.company.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BooksList implements BooksListHelper {
 private List<Book> books;

 public BooksList(){
  books = new ArrayList<>();
 }

 public BooksList(List<Book> books) {
  this.books = books;
 }

 @Override
 public void addBook(Book book) {
     books.add(book);
 }

 @Override
    public List<Book> getBooks() {
        LocalDate today = LocalDate.now();
       Book book1=new Book("Jamilya","Chyngyz Aitmatov",today,370);
        Book book2=new Book("Toolor Kulaganda","Chyngyz Aitmatov",today,370);
        Book book3=new Book("The Kite Runner","Khaled Hosseini",today,370);
        Book book4=new Book(" Algerian White","Assia Djebar",today,370);
        Book book5=new Book("He Who Searches","Luisa Valenzuela",today,370);
        Book book6=new Book("Kanduu jildar","Aaly Tokombaev",today,370);
        Book book7=new Book("Tan aldinda","Aaly Tokombaev",today,370);
        Book book8=new Book("Kiyamat","Chyngyz Aitmatov",today,370);
        Book book9=new Book("RomeoJuliet","William Shakespeare",today,370);
        Book book10=new Book("Evgenii Onegin","Aleksandr Pushkin",today,370);
        addBook(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        return books;
    }
}
