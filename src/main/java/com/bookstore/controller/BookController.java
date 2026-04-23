package com.bookstore.controller;

import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/books")
    public String list(Model model) {
        model.addAttribute("books", service.getAll());
        return "book-list";
    }

    @GetMapping("/books/{id}")
    public String detail(@PathVariable("id") int id, Model model) {

        var bookOpt = service.findById(id);

        if (bookOpt.isEmpty()) {
            return "redirect:/books";
        }

        model.addAttribute("book", bookOpt.get());
        return "book-detail";
    }
}