package com.company;

import java.time.LocalDate;
import java.util.List;

public class Student extends User {
    public Student(String first_name, String last_name, String phone_number) {
        super(first_name, last_name, phone_number);
    }
    private String city;
    private LocalDate localDate;
    private List<Book> books;

    public Student(String first_name, String last_name, String phone_number, String city, LocalDate localDate) {
        super(first_name, last_name, phone_number);
        this.city = city;
        this.localDate = localDate;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }
}