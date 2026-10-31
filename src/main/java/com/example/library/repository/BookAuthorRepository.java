package com.example.library.repository;

import com.example.library.model.BookAuthor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookAuthorRepository {
    private final List<BookAuthor> bookAuthors = new ArrayList<>();

    public BookAuthor save(BookAuthor bookAuthor) {
        delete(bookAuthor.getId());
        bookAuthors.add(bookAuthor);
        return bookAuthor;
    }

    public List<BookAuthor> findAll() {
        return new ArrayList<>(bookAuthors);
    }

    public Optional<BookAuthor> findById(String id) {
        return bookAuthors.stream().filter(ba -> ba.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        bookAuthors.removeIf(ba -> ba.getId().equals(id));
    }
}