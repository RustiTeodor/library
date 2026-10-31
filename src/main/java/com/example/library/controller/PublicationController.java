package com.example.library.controller;

import com.example.library.model.Publication;
import com.example.library.service.PublicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/publications")
public class PublicationController {
    private final PublicationService publicationService;

    public PublicationController(PublicationService publicationService) {
        this.publicationService = publicationService;
    }

    @GetMapping
    public List<Publication> getAllPublications() {
        return publicationService.getAllPublications();
    }

    @GetMapping("/{id}")
    public Optional<Publication> getPublicationById(@PathVariable String id) {
        return publicationService.getPublicationById(id);
    }

    @PostMapping
    public Publication createPublication(@RequestBody Publication publication) {
        return publicationService.savePublication(publication);
    }

    @DeleteMapping("/{id}")
    public void deletePublication(@PathVariable String id) {
        publicationService.deletePublication(id);
    }
}