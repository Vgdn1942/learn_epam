package com.vgdn1942.learn.payment;

import java.util.ArrayList;
import java.util.List;

public class Payment {
    List<Product> products = new ArrayList<>();

    public Payment() {
    }

    public void printProduct() {
        for (Product prod : products) {
            System.out.println(prod.toString());
        }
    }

    public void printAmount() {
        double total = 0.0;
        for (Product prod : products) {
            total += prod.price;
        }
        System.out.println("Сумма: " + total);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(String name, double price) {
        products.add(new Product(name, price));
    }

    private class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Товар: {" +
                    "наименование: '" + name + '\'' +
                    "; цена: " + price +
                    '}';
        }
    }
}
