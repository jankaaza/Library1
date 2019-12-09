package com.company.interfaces;

import com.company.Book;
import com.company.Student;

import java.util.List;

public interface StudentListHelper {
    void addStudent(Student student);
    List<Student> getStudents();
}
