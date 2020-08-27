package com.example.commandlinerunner;

import com.example.commandlinerunner.repository.Book;
import com.example.commandlinerunner.repository.BookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CommandLineRunner {

    private BookRepository bookRepository;

    CommandLineRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Bean
    public org.springframework.boot.CommandLineRunner run() {
        return args -> {
            Book entity1 = new Book("How to stay focused", "Miriyam Bali");
            Book entity2 = new Book("Turn the World", "Cliyo Mathew");
            Book entity3 = new Book("New Heights", "Arsana Jyesh");
            Book entity4 = new Book("Create into leaves", "Nicholas A Buzaz");

            List<Book> books = Arrays.asList(entity1, entity2, entity3, entity4);
            this.bookRepository.saveAll(books);
        };
    }
}
