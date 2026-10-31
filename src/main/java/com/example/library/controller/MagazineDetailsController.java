package com.example.library.controller;

import com.example.library.model.MagazineDetails;
import com.example.library.service.MagazineDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/magazines")
public class MagazineDetailsController {
    private final MagazineDetailsService magazineDetailsService;

    public MagazineDetailsController(MagazineDetailsService magazineDetailsService) {
        this.magazineDetailsService = magazineDetailsService;
    }

    @GetMapping
    public List<MagazineDetails> getAllMagazines() {
        return magazineDetailsService.getAllMagazines();
    }

    @GetMapping("/{id}")
    public Optional<MagazineDetails> getMagazineById(@PathVariable String id) {
        return magazineDetailsService.getMagazineById(id);
    }

    @PostMapping
    public MagazineDetails createMagazine(@RequestBody MagazineDetails magazine) {
        return magazineDetailsService.saveMagazine(magazine);
    }

    @DeleteMapping("/{id}")
    public void deleteMagazine(@PathVariable String id) {
        magazineDetailsService.deleteMagazine(id);
    }
}