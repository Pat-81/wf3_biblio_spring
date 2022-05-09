package com.example.biblio.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Book
 */
public class Book {
    private String title;
    private String category;
    private List<Book> bookList = new ArrayList<>();

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public List<Book> embaucher(Book book) {
        this.bookList.add(book);
        return bookList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Book> getBookList() {
        return this.bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

}