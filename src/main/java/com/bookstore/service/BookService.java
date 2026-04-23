package com.bookstore.service;

import com.bookstore.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final List<Book> books = List.of(
            new Book(1, "Clean Code", "Robert C. Martin", 350000),
            new Book(2, "Effective Java", "Joshua Bloch", 400000),
            new Book(3, "Spring in Action", "Craig Walls", 250000),
            new Book(4, "Design Patterns", "GoF", 500000)
    );

    public List<Book> getAll() {
        return books;
    }

    public Optional<Book> findById(int id) {
        return books.stream()
                .filter(b -> b.getId() == id)
                .findFirst();
    }
}