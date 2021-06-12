package com.example.boot.services;

import com.example.boot.data.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthorService {

    private JdbcTemplate jdbcTemplate;
    private static final String ALL_AUTHORS = "select * from authors";
    private static final String AUTHOR = "select * from authors where id = ?";

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAllAuthors() {
        return jdbcTemplate.query(ALL_AUTHORS, (ResultSet rs, int rowNum) -> {
            Author author = new Author();
            author.setId(rs.getInt("id"));
            author.setFullName(rs.getString("fullName"));
            return author;
        });
    }

    public Author getAuthorById(Integer id) {
        return (Author) jdbcTemplate.queryForObject(
                AUTHOR,
                new Object[]{id},
                new BeanPropertyRowMapper(Author.class));
    }
}
