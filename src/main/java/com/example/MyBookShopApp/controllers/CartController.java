package com.example.MyBookShopApp.controllers;

import com.example.MyBookShopApp.data.Book;
import com.example.MyBookShopApp.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    private final BookService bookService;

    @Autowired
    public CartController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/cart")
    public String cartPage(Model model){
        model.addAttribute("books", bookService.getBooksData(Book.Type.Cart));
        return "cart";
    }

    @GetMapping("/postponed")
    public String postponedPage(Model model){
        model.addAttribute("books", bookService.getBooksData(Book.Type.Cart));
        return "postponed";
    }
}
