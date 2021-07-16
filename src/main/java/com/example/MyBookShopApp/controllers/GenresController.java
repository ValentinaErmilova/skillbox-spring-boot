package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresController {

//    private final AuthorService authorService;
//
//    @Autowired
//    public AuthorsController(AuthorService authorService) {
//        this.authorService = authorService;
//    }
//
//    @ModelAttribute("authorsMap")
//    public Map<String, List<Author>> authorsMap(){
//        return authorService.getAuthorsMap();
//    }

    @GetMapping("/genres")
    public String genresPage(){
        return "genres/index";
    }
}
