package com.company;

import com.company.interfaces.BooksListHelper;
import com.company.interfaces.StudentListHelper;
import com.company.interfaces.implement.BooksList;
import com.company.interfaces.implement.StudentList;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends User {
    private BooksList books;
    private StudentList students;
    public Administrator(){
        books = new BooksList();
        students = new StudentList();
    }
    public Administrator(String first_name, String last_name, String phone_number) {
        super(first_name, last_name, phone_number);
        books = new BooksList();
        students = new StudentList();
    }

    public Administrator(String first_name, String last_name, String phone_number, BooksList books, StudentList students) {
        super(first_name, last_name, phone_number);
        this.books = books;
        this.students = students;
    }

    public BooksList getBooks() {
        return books;
    }

    public void setBooks(BooksList books) {
        this.books = books;
    }

    public StudentList getStudents() {
        return students;
    }

    public void setStudents(StudentList students) {
        this.students = students;
    }
}
