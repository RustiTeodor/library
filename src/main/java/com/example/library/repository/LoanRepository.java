package com.example.library.repository;

import com.example.library.model.Loan;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LoanRepository {
    private List<Loan> loans = new ArrayList<>();

    public Loan save(Loan loan) {
        loans.add(loan);
        return loan;
    }

    public List<Loan> findAll() {
        return loans;
    }

    public Optional<Loan> findById(String id) {
        return loans.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }

    public void delete(String id) {
        loans.removeIf(l -> l.getId().equals(id));
    }
}
