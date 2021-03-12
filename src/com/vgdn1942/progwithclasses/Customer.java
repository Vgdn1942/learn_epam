package com.vgdn1942.progwithclasses;

import java.util.Arrays;
import java.util.Comparator;

class CustomerMain {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Иванов", "Александр", "Борисович",
                        "Бельского 43-15", "12345", "67890"),
                new Customer("Петров", "Виктор", "Михайлович",
                        "Бельского 59-20", "54321", "98760"),
                new Customer("Сидоров", "Виталий", "Григорьевич",
                        "Жилуновича 34-45", "45698", "58933"),
                new Customer("Ковалёв", "Василий", "Михайлович",
                        "пр. Пушкина 115-56", "21547", "23364"),
                new Customer("Казаков", "Дмитрий", "Евгеньевич",
                        "Я.Мавра 56-19", "98754", "36548"),
                new Customer("Козлов", "Борис", "Александрович",
                        "Притыцкого 89-14", "65547", "55478"),
                new Customer("Джавов", "Григорий", "Валерьевич",
                        "пр. Партизанский 98-64", "63336", "85412"),
                new Customer("Епамов", "Николай", "Николаевич",
                        "Пономаренко 43-11", "99752", "20014"),
                new Customer("Семёнов", "Михаил", "Михайлович",
                        "Одоевского 115-2", "99654", "77541"),
                new Customer("Титов", "Александр", "Фёдорович",
                        "Пономаренко 46-18", "20154", "75545"),
        };
        InfoCustomer infoCustomer = new InfoCustomer(1);
        for (Customer value : customers) {
            infoCustomer.pushCustomer(value);
        }
        System.out.println("Покупатели в алфавитном порядке:");
        infoCustomer.sortByName();
        infoCustomer.print();
        System.out.println();
        System.out.println("Покупатели с диапазоном номеров карт 30000 80000:");
        infoCustomer.printCard("30000", "80000");
    }
}

class InfoCustomer {
    private Customer[] customers;
    private int capacity;
    private int size;

    public InfoCustomer(int cap) {
        size = 0;
        capacity = cap;
        customers = new Customer[capacity];
    }

    public InfoCustomer() {
        this(10);
    }

    public void pushCustomer(Customer customer) {
        if (size >= capacity) {
            Customer[] buffer = new Customer[capacity * 2];
            if (size >= 0) System.arraycopy(customers, 0, buffer, 0, size);

            customers = buffer;
            capacity = capacity * 2;
        }
        customers[size] = customer;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            customers[i].print();
        }
    }

    public void sortByName() {
        Arrays.sort(customers, 0, size, new Customer.ByNameComparator());
    }

    public void printCard(String a, String b) {
        for (int i = 0; i < size; ++i) {
            if (customers[i].getCardNumber().compareTo(a) >= 0 &&
                    customers[i].getCardNumber().compareTo(b) <= 0)
                customers[i].print();
        }
    }
}

public class Customer {
    private int id;
    private static int ID;
    private String surname;
    private String name;
    private String patronymic; // фамилия
    private String address;
    private String cardNumber;
    private String bankNumber;

    Customer(String surname, String name, String patronymic,
             String address, String cardNumber, String bankNumber) {
        this.id = ID++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankNumber = bankNumber;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    @Override
    public String toString() {
        return "Customer {" +
                " ID: " + id +
                ", Фамилия: '" + surname + '\'' +
                ", Имя: '" + name + '\'' +
                ", Отчество: '" + patronymic + '\'' +
                ", Адрес: '" + address + '\'' +
                ", Номер карты: " + cardNumber +
                ", Номер счёта: " + bankNumber +
                " }";
    }

    public void print() {
        System.out.println(toString());
    }

    public static class ByNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer left, Customer right) {
            if (!left.surname.equals(right.surname))
                return left.surname.compareTo(right.surname);
            if (!left.name.equals(right.name))
                return left.name.compareTo(right.name);
            return left.patronymic.compareTo(right.patronymic);
        }
    }
}
