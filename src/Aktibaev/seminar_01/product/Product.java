package Aktibaev.seminar_01.product;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Product: name=" + name + ", price=" + price + "р.";
    }
}
