package com.nishan;

import java.awt.print.Book;

public class Books {
    int id, quantity;
    String bookName, author, publisher;

    public Books(int id, int quantity, String bookName, String author, String publisher) {
        this.id = id;
        this.quantity = quantity;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }
}
