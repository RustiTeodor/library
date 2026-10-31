package com.example.library.controller;

import com.example.library.model.BookAuthor;
import com.example.library.service.BookAuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book-authors")
public class BookAuthorController {
    private final BookAuthorService bookAuthorService;

    public BookAuthorController(BookAuthorService bookAuthorService) {
        this.bookAuthorService = bookAuthorService;
    }

    @GetMapping
    public List<BookAuthor> getAllBookAuthors() {
        return bookAuthorService.getAllBookAuthors();
    }

    @GetMapping("/{id}")
    public Optional<BookAuthor> getBookAuthorById(@PathVariable String id) {
        return bookAuthorService.getBookAuthorById(id);
    }

    @PostMapping
    public BookAuthor createBookAuthor(@RequestBody BookAuthor bookAuthor) {
        return bookAuthorService.saveBookAuthor(bookAuthor);
    }

    @DeleteMapping("/{id}")
    public void deleteBookAuthor(@PathVariable String id) {
        bookAuthorService.deleteBookAuthor(id);
    }
}