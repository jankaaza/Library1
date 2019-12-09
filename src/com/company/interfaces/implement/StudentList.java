package com.company.interfaces.implement;

import com.company.Book;
import com.company.Student;
import com.company.interfaces.StudentListHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentList implements StudentListHelper {
    List<Student> students;

    public StudentList(List<Student> students) {
        this.students = students;
    }

    public StudentList(){
        students = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getStudents() {
        LocalDate today = LocalDate.now();
        Student student1=new Student("Janargul","Azamat kyzy","12345","Osh",today);
        Student student2=new Student("Ayperi","Akim kyzy","12345","Osh",today);
        Student student3=new Student("Yrysgul","Ysmanova","12345","Osh",today);
        addStudent(student1);
        addStudent(student2);
        addStudent(student3);
        return students;
    }
    public void addBook(Book book) {
        addBook(book);
    }
}
