package entities;

public class Customer {
    private static int autoId;
    private int id;
    private  String name;
    private  String address;

    public Customer(String name, String address) {
        this.id = ++autoId;
        this.name = name;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
