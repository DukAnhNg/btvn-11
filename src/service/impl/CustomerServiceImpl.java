package service.impl;

import entities.Book;
import entities.Customer;
import service.IServiceLibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerServiceImpl implements IServiceLibrary<Customer> {
    @Override
    public void insert(Customer customer, ArrayList<Customer> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tên");
        String name = sc.nextLine();
        System.out.println("Mời nhập địa chỉ");
        String address = sc.nextLine();
        customer = new Customer(name,address);
        list.add(customer);
    }

    @Override
    public void delete(Customer customer, ArrayList<Customer> list) {

    }
}
