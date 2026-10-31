package com.example.library.repository;

import com.example.library.model.Publication;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PublicationRepository {
    private final List<Publication> publications = new ArrayList<>();

    public Publication save(Publication publication) {
        delete(publication.getId());
        publications.add(publication);
        return publication;
    }

    public List<Publication> findAll() {
        return new ArrayList<>(publications);
    }

    public Optional<Publication> findById(String id) {
        return publications.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        publications.removeIf(p -> p.getId().equals(id));
    }
}