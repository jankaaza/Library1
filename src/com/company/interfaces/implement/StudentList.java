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
        Student student1=new Student("Munar","Jenishbekov","12345","Osh",today);
        Student student2=new Student("Adilbek","Ashimov","12345","Osh",today);
        Student student3=new Student("Yrysbek","Sagyndykov","12345","Osh",today);
        Student student4=new Student("Idiris","Sattarov","12345","Osh",today);
        addStudent(student1);
        addStudent(student2);
        addStudent(student3);
        addStudent(student4);
        return students;
    }
}
