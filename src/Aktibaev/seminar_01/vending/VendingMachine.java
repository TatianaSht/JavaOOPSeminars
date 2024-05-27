package Aktibaev.seminar_01.vending;

import Aktibaev.seminar_01.product.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> productList;

    public VendingMachine() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public Product getProductByName(String nameProduct){
        for (Product product: productList){
            if (product.getName().equalsIgnoreCase(nameProduct)){
                return product;
            }
        }
        return null;
    }

    public String getProductsInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:\n");
        for (Product product: productList) {
            stringBuilder.append(product);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return getProductsInfo();
    }
}
