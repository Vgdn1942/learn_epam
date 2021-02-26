package com.vgdn1942.progwithclasses;

class BookMain {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Книга 1", "Александр", "Свет",
                        "1980", "235", "30р.", "Твёрдый"),
                new Book("Книга 2", "Виктор", "Дом печати",
                        "1936", "321", "60р.", "Мягкий"),
                new Book("Книга 3", "Виталий", "Типография Звезда",
                        "1995", "698", "33р.", "Мягкий"),
                new Book("Книга 4", "Василий", "Печатный дом",
                        "1974", "547", "64р.", "Твёрдый"),
                new Book("Книга 6", "Дмитрий", "Издательский дом",
                        "2004", "754", "48р.", "Мягкий"),
                new Book("Книга 7", "Борис", "Печатный дом",
                        "2010", "547", "58р.", "Твёрдый"),
                new Book("Книга 8", "Виталий", "Типография Весна",
                        "2002", "336", "12р.", "Твёрдый"),
        };
        InfoBook infoBook = new InfoBook(1);
        for (Book value : books) {
            infoBook.pushCustomer(value);
        }
        System.out.println("Список книг автора 'Виталий':");
        infoBook.printByAuthor("Виталий");
        System.out.println("Список книг типографии 'Печатный дом':");
        infoBook.printByPublishing("Печатный дом");
        System.out.println("Список книг выпущенных после 1990 года:");
        infoBook.printByOldYear("1990");
    }
}

class InfoBook {
    private Book[] books;
    private int capacity;
    private int size;

    public InfoBook(int cap) {
        size = 0;
        capacity = cap;
        books = new Book[capacity];
    }

    public InfoBook() {
        this(10);
    }

    public void pushCustomer(Book customer) {
        if (size >= capacity) {
            Book[] buffer = new Book[capacity * 2];
            if (size >= 0) System.arraycopy(books, 0, buffer, 0, size);

            books = buffer;
            capacity = capacity * 2;
        }
        books[size] = customer;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; ++i) {
            books[i].print();
        }
    }

    public void printByAuthor(String author) {
        for (int i = 0; i < size; ++i) {
            if (books[i].getAuthor().equals(author))
                books[i].print();
        }
    }

    public void printByPublishing(String publishing) {
        for (int i = 0; i < size; ++i) {
            if (books[i].getPublishing().equals(publishing))
                books[i].print();
        }
    }

    public void printByOldYear(String years) {
        for (int i = 0; i < size; ++i) {
            if (books[i].getYears().compareTo(years) >= 0)
                books[i].print();
        }
    }
}

public class Book {
    private int id;
    private static int ID;
    private String title;
    private String author;
    private String publishing;
    private String years;
    private String pages;
    private String price;
    private String binding;

    Book(String title, String author, String publishing,
         String years, String pages, String price, String binding) {
        this.id = ID++;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.years = years;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book {" +
                " ID: " + id +
                ", Название: '" + title + '\'' +
                ", Автор(ы): '" + author + '\'' +
                ", Издательство: '" + publishing + '\'' +
                ", Год издания: '" + years + '\'' +
                ", Кол-во страниц: " + pages +
                ", Цена: " + price +
                ", Тип переплёта: " + binding +
                " }";
    }

    public void print() {
        System.out.println(toString());
    }
}
