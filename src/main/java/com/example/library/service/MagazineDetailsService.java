package com.example.library.service;

import com.example.library.model.MagazineDetails;
import com.example.library.repository.MagazineDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MagazineDetailsService {
    private final MagazineDetailsRepository magazineDetailsRepository;

    public MagazineDetailsService(MagazineDetailsRepository magazineDetailsRepository) {
        this.magazineDetailsRepository = magazineDetailsRepository;
    }

    public MagazineDetails saveMagazine(MagazineDetails magazine) {
        return magazineDetailsRepository.save(magazine);
    }

    public List<MagazineDetails> getAllMagazines() {
        return magazineDetailsRepository.findAll();
    }

    public Optional<MagazineDetails> getMagazineById(String id) {
        return magazineDetailsRepository.findById(id);
    }

    public void deleteMagazine(String id) {
        magazineDetailsRepository.delete(id);
    }
}