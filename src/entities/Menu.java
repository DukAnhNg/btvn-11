package entities;

import service.impl.BookServiceImpl;
import service.impl.CustomerServiceImpl;
import service.impl.TicketBookImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public Menu(Scanner sc) {
        BookServiceImpl bookService= new BookServiceImpl();

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<TicketBook> ticketBooks = new ArrayList<>();

            do {
                System.out.println("1.Thêm sách");
                System.out.println("2.Xóa sách");
                System.out.println("3.Thêm người");
                System.out.println("4.Mượn sách");
                int choose = Integer.parseInt(sc.nextLine());
                Book book = null;
                switch (choose){
                    case 1:

                        bookService.insert(book,books);
                        break;
                    case 2:
                        
                        bookService.delete(book,books);
                        break;
                    case 3:
                        CustomerServiceImpl customerService = new CustomerServiceImpl();
                        Customer customer = null;

                        customerService.insert(customer,customers);
                        break;
                    case 4:
                        TicketBookImpl ticketService = new TicketBookImpl();
                        TicketBook ticketBook = null;
                        ticketService.insert(ticketBook,ticketBooks);
                        break;
                }
            }while (true);

    }
}
