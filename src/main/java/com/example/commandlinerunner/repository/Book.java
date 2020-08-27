package com.example.commandlinerunner.repository;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty
    private String title;
    @JsonProperty
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
