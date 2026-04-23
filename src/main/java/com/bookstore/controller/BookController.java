package com.bookstore.controller;

import com.bookstore.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    private final List<Book> books = List.of(
            new Book(1, "Clean Code", "Robert C. Martin", 350000),
            new Book(2, "Effective Java", "Joshua Bloch", 400000),
            new Book(3, "Spring in Action", "Craig Walls", 250000),
            new Book(4, "Design Patterns", "GoF", 500000)
    );

    @GetMapping("/books")
    public String list(Model model) {
        model.addAttribute("books", books);
        return "book-list";
    }

    @GetMapping("/books/{id}")
    public String detail(@PathVariable int id, Model model) {

        Book found = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);

        if (found == null) {
            return "redirect:/books";
        }

        model.addAttribute("book", found);
        return "book-detail";
    }
}