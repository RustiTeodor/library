package com.example.library.service;

import com.example.library.model.BookDetails;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookDetails saveBook(BookDetails book) {
        return bookRepository.save(book);
    }

    public List<BookDetails> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<BookDetails> getBookById(String id) {
        return bookRepository.findById(id);
    }

    public void deleteBook(String id) {
        bookRepository.delete(id);
    }
}