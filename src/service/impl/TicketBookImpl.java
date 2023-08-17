package service.impl;

import entities.Book;
import entities.TicketBook;
import service.IServiceLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketBookImpl implements IServiceLibrary<TicketBook> {
    @Override
    public void insert(TicketBook ticketBook, ArrayList<TicketBook> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập thời gian mượn");
        String dateStart = sc.nextLine();
        LocalDate startDate = LocalDate.parse(dateStart, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Mời nhập ngày trả");
        String dateEnd = sc.nextLine();
        LocalDate endDate = LocalDate.parse(dateEnd, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        ticketBook = new TicketBook(ticketBook.getCustomer(), ticketBook.getBook(), startDate,endDate);
        list.add(ticketBook);
    }

    @Override
    public void delete(TicketBook ticketBook, ArrayList<TicketBook> list) {
    }
}
