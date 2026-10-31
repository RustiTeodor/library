package com.example.library.service;

import com.example.library.model.Publication;
import com.example.library.repository.PublicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublicationService {
    private final PublicationRepository publicationRepository;

    public PublicationService(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }

    public Publication savePublication(Publication publication) {
        return publicationRepository.save(publication);
    }

    public List<Publication> getAllPublications() {
        return publicationRepository.findAll();
    }

    public Optional<Publication> getPublicationById(String id) {
        return publicationRepository.findById(id);
    }

    public void deletePublication(String id) {
        publicationRepository.delete(id);
    }
}