package com.example.library.repository;

import com.example.library.model.Library;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LibraryRepository {
    private final List<Library> libraries = new ArrayList<>();

    public Library save(Library library) {
        delete(library.getId());
        libraries.add(library);
        return library;
    }

    public List<Library> findAll() {
        return new ArrayList<>(libraries);
    }

    public Optional<Library> findById(String id) {
        return libraries.stream().filter(l -> l.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        libraries.removeIf(l -> l.getId().equals(id));
    }
}