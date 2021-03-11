package com.vgdn1942.learn.payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.addProduct("Хлеб 'Водар'", 0.78);
        payment.addProduct("Вода 'Минская 4'", 1.1);
        payment.addProduct("Напиток 'Росинка'", 2.5);
        payment.printProduct();
        payment.printAmount();
    }
}
