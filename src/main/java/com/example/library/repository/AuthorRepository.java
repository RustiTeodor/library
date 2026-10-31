package com.example.library.repository;

import com.example.library.model.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepository {
    private List<Author> authors = new ArrayList<>();

    public Author save(Author author) {
        authors.add(author);
        return author;
    }

    public List<Author> findAll() {
        return authors;
    }

    public Optional<Author> findById(String id) {
        return authors.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }

    public void delete(String id) {
        authors.removeIf(a -> a.getId().equals(id));
    }
}
