package com.example.boot.controllers;

import com.example.boot.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService bookService) {
        this.authorService = bookService;
    }

    @GetMapping("/authors")
    public String authors(Model model) {
        model.addAttribute("authors", authorService.getAllAuthors());
        return "authors/index";
    }
}
