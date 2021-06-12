package com.example.boot.controllers;

import com.example.boot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainBookController {

    private final BookService bookService;

    @Autowired
    public MainBookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value={"/index", "/"})
    public String index(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "index";
    }

    @GetMapping("/genres")
    public String genres() {
        return "genres/index";
    }
}
