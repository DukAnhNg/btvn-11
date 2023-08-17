package entities;

public class Book {
    private static int autoId;
    private  int id;
    private String name;
    private double price;

    public Book(String name, double price) {
        this.id = ++autoId;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
