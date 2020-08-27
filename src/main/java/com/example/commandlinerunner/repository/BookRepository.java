package com.example.commandlinerunner.repository;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public void saveAll(List<Book> books) {
        this.books.addAll(books);
    }

    public List<Book> getBooks() {
        return books;
    }
}
