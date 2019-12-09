package com.company.interfaces.implement;

import com.company.Administrator;
import com.company.Book;
import com.company.Student;
import com.company.interfaces.Login;
import com.company.interfaces.StudentListHelper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginImpl implements Login {
    @Override
    public void log_in(String name) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Who are you? -  ");
        name = input.nextLine();

        Administrator admin = new Administrator();
        BooksList books = new BooksList();
        StudentList studentList = new StudentList();

        if (name.equals("Admin")) {
            System.out.println("If you want to see Students list click 2, if you want to see Books list click 1");
            int number = input.nextInt();
            if (number == 1) {
                System.out.println("Books List");
                for (Book book : admin.getBooks().getBooks()) {
                    System.out.println(book.getBook_name() + " " + book.getAvtor());
                }
            } else if (number == 2) {
                for (Student student : admin.getStudents().getStudents()) {
                    System.out.println(student.getFirstName() + " " + student.getLastName() + "  " + student.getBooks());
                }
            }
        } else if (name.equals("Student")) {
            System.out.println("What is your name? -  ");
            String firstName = input.nextLine();
            System.out.println("What is your surname? -  ");
            String lastName = input1.nextLine();
            admin.getStudents().addStudent(new Student(firstName, lastName, "0777854"));
            System.out.println("What is the name of book? -  ");
            String bookName = input.nextLine();
            String avtor = input1.nextLine();
            LocalDate today = LocalDate.now();
            Book book2 = new Book("Toolor kulaganda", "Chyngyz Aitmatov", today, 123);
            //------------------------
            for (Student student : admin.getStudents().getStudents()) {
                if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                    for (Book book : books.getBooks()) {


                        LocalDate today1 = LocalDate.now();
                        if (bookName.equals(book.getBook_name()) && avtor.equals((book.getAvtor()))) {
                            List<Book> books1 = new ArrayList<>();
                            Book book1 = new Book(bookName, avtor, today1, 123);
                            //  Book book2 = new Book("Toolor kulaganda", "Chyngyz Aitmatov", today, 123);
                            //books1.add(book1);
                            // books1.add(book2);
                            System.out.println("add 1");
                            int number = input.nextInt();
                            if (number == 1) {
                                books1.add(book1);
                                System.out.println("dagi koshuu ");
                               books1.add(book2);

                                student.setBooks(books1);
                                System.out.println("You took  ' " + student.getBooks().get(0).getBook_name() + " ' " + student.getBooks().get(0).getAvtor() + ".");

                                        //System.out.println("You took  ' " + student.getBooks().get(0).getBook_name() + " ' " + student.getBooks().get(0).getAvtor() + "  book .");
                                       System.out.println("Your books: ");
                                        for (Book book3 : student.getBooks()) {
                                            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + book3.getBook_name() + " " + book3.getAvtor());
                                        }
                                    }
                                }

                            }
                        }

                    }

                }
            }
        }




