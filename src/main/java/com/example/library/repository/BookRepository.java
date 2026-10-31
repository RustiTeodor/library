package com.example.library.repository;

import com.example.library.model.BookDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    private final List<BookDetails> books = new ArrayList<>();

    public BookDetails save(BookDetails book) {
        delete(book.getId());
        books.add(book);
        return book;
    }

    public List<BookDetails> findAll() {
        return new ArrayList<>(books);
    }

    public Optional<BookDetails> findById(String id) {
        return books.stream().filter(b -> b.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        books.removeIf(b -> b.getId().equals(id));
    }
}