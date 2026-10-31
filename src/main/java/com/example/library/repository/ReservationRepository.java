package com.example.library.repository;

import com.example.library.model.Reservation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    private final List<Reservation> reservations = new ArrayList<>();

    public Reservation save(Reservation reservation) {
        delete(reservation.getId());
        reservations.add(reservation);
        return reservation;
    }

    public List<Reservation> findAll() {
        return new ArrayList<>(reservations);
    }

    public Optional<Reservation> findById(String id) {
        return reservations.stream().filter(r -> r.getId().equals(id)).findFirst();
    }

    public void delete(String id) {
        reservations.removeIf(r -> r.getId().equals(id));
    }
}