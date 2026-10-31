package com.example.library.repository;

import com.example.library.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public Book save(Book book) {
        books.add(book);
        return book;
    }

    public List<Book> findAll() {
        return books;
    }

    public Optional<Book> findById(String id) {
        return books.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst();
    }

    public void delete(String id) {
        books.removeIf(b -> b.getId().equals(id));
    }
}
