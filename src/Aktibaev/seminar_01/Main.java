package Aktibaev.seminar_01;

import Aktibaev.seminar_01.product.Bottle;
import Aktibaev.seminar_01.product.Product;
import Aktibaev.seminar_01.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product product1 = new Product("twix", 100);
        Product product2 = new Bottle("cola", 150, 1.5);
        Product product3 = new Product("baunty", 80);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);

        System.out.println(vendingMachine);
    }
}
