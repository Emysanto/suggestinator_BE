package com.suggestinator.restapi.bookcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suggestinator.restapi.entity.Book;
import com.suggestinator.restapi.repository.BookRepository;

@RestController
public class bookcontroller {

    @Autowired
    private BookRepository bookRepository;

    // localhost:8080/books
    @GetMapping("/books")
    public List<Book> getAllBooks() {
        // Fetch all books from the database
        return bookRepository.findAll();
    }
}
