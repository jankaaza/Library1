package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
    public String book_name;
 public   String avtor;
  public LocalDate createdate;
   public int page_size;
   private List < Student > students;

    public Book(String book_name, String avtor, LocalDate createdate, int page_size) {
        this.book_name = book_name;
        this.avtor = avtor;
        this.createdate = createdate;
        this.page_size = page_size;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public LocalDate getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDate createdate) {
        this.createdate = createdate;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student students) {
        if (this.students == null) {
            this.students = new ArrayList<>();
        }
        this.students.add(students);
    }
    public void printStudents() {
        for (Student student : this.students) {
            System.out.println(student.getFirstName()+" "+student.getLastName()+ " "+student.getCity() +" "+ student.getPhone_number()+"  "+student.getLocalDate());
        }
    }
}
