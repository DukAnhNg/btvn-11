package service.impl;

import entities.Book;
import service.IServiceLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class BookServiceImpl implements IServiceLibrary<Book> {

    @Override
    public void insert(Book book, ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên");
        String name = sc.nextLine();
        System.out.println("Mời nhập giá");
        double price = Double.parseDouble(sc.nextLine());
        book = new Book(name,price);
        list.add(book);
    }

    @Override
    public void delete(Book book, ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên sách muốn xóa");
        String name = sc.nextLine();
        list.removeIf(b -> b.getName().equals(name));
    }
}
