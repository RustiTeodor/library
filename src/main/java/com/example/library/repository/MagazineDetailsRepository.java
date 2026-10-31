package com.example.library.repository;

import com.example.library.model.MagazineDetails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MagazineDetailsRepository {
    private final List<MagazineDetails> magazines = new ArrayList<>();

    public MagazineDetails save(MagazineDetails magazine) {
        delete(magazine.getId());
        magazines.add(magazine);
        return magazine;
    }

    public List<MagazineDetails> findAll() {
        return new ArrayList<>(magazines);
    }

    public Optional<MagazineDetails> findById(String id) {
        return magazines.stream().filter(m -> m.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        magazines.removeIf(m -> m.getId().equals(id));
    }
}