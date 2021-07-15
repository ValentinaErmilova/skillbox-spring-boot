package com.example.MyBookShopApp.data;

import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> getBooksData(Book.Type type) {

        String where;
        switch (type) {
            case Recomended:
                where = " WHERE isRecomended = TRUE";
                break;
            case Recent:
                where = " WHERE isNew = TRUE";
                break;
            case Popular:
                where = " WHERE isPopular = TRUE";
                break;
            case Cart:
                where = " WHERE isCart = TRUE";
                break;
            case Kept:
                where = " WHERE isKept = TRUE";
                break;
            default:
                where = "";
        }
        List<Book> books = jdbcTemplate.query("SELECT * FROM books" + where,(ResultSet rs, int rowNum) -> {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setAuthor(rs.getString("author"));
            book.setTitle(rs.getString("title"));
            book.setPriceOld(rs.getString("priceOld"));
            book.setPrice(rs.getString("price"));
            return book;
        });
        return new ArrayList<>(books);
    }
}
