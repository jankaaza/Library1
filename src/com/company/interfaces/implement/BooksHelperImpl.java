package com.company.interfaces.implement;

import com.company.Book;
import com.company.interfaces.BooksHelper;
import com.company.interfaces.BooksListHelper;

import java.util.Scanner;

public class BooksHelperImpl implements BooksHelper {
    @Override
    public void clickNumber() {
        System.out.println("If you want to take books click: 1, If you want to turn in books click: 2");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number == 1) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Which book do you want ? ");
            String bookname = input1.nextLine();
            BooksListHelper booksListHelper =new BooksList();
           for(Book book: booksListHelper.getBooks())

            if(bookname.equals(book.getBook_name())){
                System.out.println("siz algan kitep : "+ book.getAvtor()+" "+ book.getBook_name()+" "+book.getPage_size()) ;
                //Student student=new Student("sdv","dvs","b");

//                book.addStudent();
            }
        }
    }
}
