package com.example.boot.services;

import com.example.boot.data.Author;
import com.example.boot.data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.List;

@Service
public class BookService {

    private JdbcTemplate jdbcTemplate;

//    private AuthorService authorService;

    private static final String ALL_BOOKS = "" +
            "select b.id, b.title, b.priceold as price_old,b.price, a.fullName as author_name\n" +
            "from books b\n" +
            "join authors a on b.authorId = a.id";

    @Autowired
    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getAllBooks() {
        return jdbcTemplate.query(ALL_BOOKS, (ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setPrice(rs.getString("price"));
            book.setPriceOld(rs.getString("price_old"));
            book.setAuthorName(rs.getString("author_name"));
            return book;
        });
    }

//    @Autowired
//    public void setAuthorService(AuthorService authorService) {
//        this.authorService = authorService;
//    }
}
