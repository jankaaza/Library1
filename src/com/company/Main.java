package com.company;

import com.company.interfaces.FileReadHelper;
import com.company.interfaces.implement.BooksList;
import com.company.interfaces.implement.FileReadHelperImpl;
import com.company.interfaces.implement.StudentList;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Who are you? -  ");
         String name = input.nextLine();

        Administrator admin = new Administrator();

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
                    if (student.getFirstName().equals("Munar")) {
                        System.out.println("   1-student    " + student.getFirstName() + " " + student.getLastName() + " ");
                        FileReadHelper f = new FileReadHelperImpl();
                        System.out.println(" Books: ");
                        ArrayList<String> lines = f.ReadFromFile(new File("Munar.txt"));
                        for (int x = 0; x < lines.size(); x++) {

                            System.out.println(lines.get(x));
                        }
                    }
                    if (student.getFirstName().equals("Adilbek")) {
                        System.out.println("2-student   " + student.getFirstName() + " " + student.getLastName());
                        FileReadHelper f = new FileReadHelperImpl();
                        System.out.println(" Books: ");
                        ArrayList<String> lines = f.ReadFromFile(new File("Adilbek.txt"));
                        for (int x = 0; x < lines.size(); x++) {

                            System.out.println(lines.get(x));
                        }
                    }

                    if (student.getFirstName().equals("Yrysbek")) {
                        System.out.println("  3-student      " + student.getFirstName() + " " + student.getLastName() + "  " + student.getPhone_number());
                        FileReadHelper f = new FileReadHelperImpl();
                        System.out.println(" Books: ");
                        ArrayList<String> lines = f.ReadFromFile(new File("Yrysbek.txt"));
                        for (int x = 0; x < lines.size(); x++) {

                            System.out.println(lines.get(x));
                        }
                    }
                    if (student.getFirstName().equals("Idiris")) {
                        System.out.println("  3-student      " + student.getFirstName() + " " + student.getLastName() + "  " + student.getPhone_number());
                        FileReadHelper f = new FileReadHelperImpl();
                        System.out.println(" Books: ");
                        ArrayList<String> lines = f.ReadFromFile(new File("Idiris.txt"));
                        for (int x = 0; x < lines.size(); x++) {

                            System.out.println(lines.get(x));
                        }
                    }
                }
            }
        } else if (name.equals("Student")) {
            System.out.println("What is your firstname? -  ");
            String firstName = input.nextLine();
            System.out.println("What is your lastname? -  ");
            String lastName = input1.nextLine();
            System.out.println("Our books:");
            for (Book book : admin.getBooks().getBooks()) {
                System.out.println(book.getBook_name() +"     "+ book.getAvtor()+"   " + book.getPage_size());
            }
            Boolean bool=true;
           while(bool){
               System.out.println("What is the name of book? -  ");
               String bookName = input.nextLine();
               System.out.println("Who is the avtor of book?");
               String avtor = input1.nextLine();
            for (Student student : admin.getStudents().getStudents()) {
                if (firstName.equals(student.getFirstName()) && lastName.equals(student.getLastName())) {
                        for (Book book : admin.getBooks().getBooks()) {
                        LocalDate today1 = LocalDate.now();
                        if (bookName.equals(book.getBook_name()) && avtor.equals((book.getAvtor()))) {

                                List<Book> books1 = new ArrayList<>();
                            Book book1 = new Book(bookName, avtor, today1, 123);
                                books1.add(book1);
                                student.setBooks(books1);
                                System.out.println("Get books press 1 , Give books press 2");
                                int getORgivebook=new Scanner(System.in).nextInt();
                                if(getORgivebook==1){
                                System.out.println("Your books: ");
                                for (Book book3 : student.getBooks()) {
                                    System.out.println(student.getFirstName() + " " + student.getLastName() + " " + book3.getBook_name() + " " + book3.getAvtor());

                                    List<String> lines1 = Arrays.asList(" Book name: "+ book3.getBook_name(),"  Avtor:"+book3.getAvtor(),"   Date:"+book3.getCreatedate());


                                    Files.write(Paths.get(student.getFirstName() + ".txt"),
                                            lines1,
                                            StandardCharsets.UTF_8,
                                            StandardOpenOption.CREATE,
                                            StandardOpenOption.APPEND);
                                }
                                }
                                //---------------------------------------------------
                            else if(getORgivebook==2){
                                books1.remove(book1);
                                    for (Book book3 : student.getBooks()) {
                                        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + book3.getBook_name() + " " + book3.getAvtor());
                            File inputFile = new File(firstName+".txt");
                            File tempFile = new File(firstName+".txt");

                            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                            String currentLine;

                            while((currentLine = reader.readLine()) != null) {
                                if(null!=currentLine && !currentLine.equalsIgnoreCase(bookName)&&!!currentLine.equalsIgnoreCase(avtor)){
                                    writer.write(currentLine );
                                }
                            }
                            writer.close();
                            reader.close();
                            boolean successful = tempFile.renameTo(inputFile);
                            System.out.println(successful);
                            //----------------------------------------------
                        }
                            }
                            }
                        }break;

                }
            }

            System.out.println("Would you like to continue? ");
           String text=input.nextLine();
           if(text.equals("No")){
               System.out.println("Your books:");
               FileReadHelper f=new FileReadHelperImpl();
               ArrayList<String> lines =f.ReadFromFile(new File(firstName+".txt"));
               for(int x = 0; x < lines.size(); x++){
                   System.out.println(lines.get(x));break;}
               bool=false;
             }
           }
        }else System.out.println("It isn't found! Error" );
    }

}
//equals |== answer.toLOwerCase
//List -> set ayirma
//overide -degistirmek,