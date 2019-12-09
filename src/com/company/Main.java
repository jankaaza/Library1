package com.company;

import com.company.interfaces.Login;
import com.company.interfaces.implement.BooksList;
import com.company.interfaces.implement.LoginImpl;
import com.company.interfaces.implement.StudentList;
import sun.security.jgss.LoginConfigImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Login login=new LoginImpl();
        login.log_in("ss");
      /*    Scanner input = new Scanner(System.in);

      Administrator admin = new Administrator();
        BooksList books = new BooksList();
        StudentList studentList = new StudentList();
        System.out.println("Who are you");
        String person = "Student";

        if (person.equals("Admin")){
            for (Book book : admin.getBooks().getBooks()){
                System.out.println(book.getBook_name() + " " + book.getAvtor());
            }
        }
        else if (person.equals("Student")){
            System.out.println("What is your name? -  ");
            String firstName = input.nextLine();
            System.out.println("What is your surname? -  ");
            String lastName = input.nextLine();
            admin.getStudents().addStudent(new Student(firstName,lastName,"0777854"));
            System.out.println("What is the name of book? -  ");
            String bookName = input.nextLine();


            //------------------------
            for (Book book : books.getBooks()){
                if(bookName.equals(book.getBook_name())){
                    studentList.getStudents().get(0).addBook(book);
                }
            }
            //----------------------

            for (Student student : admin.getStudents().getStudents()){
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }*/

    }



}
