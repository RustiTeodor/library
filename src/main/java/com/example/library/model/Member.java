package com.example.library.model;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private String libraryId;
    private List<String> reservations; // sau listă de rezervări

    // Constructor
    public Member(String id, String name, String libraryId) {
        this.id = id;
        this.name = name;
        this.libraryId = libraryId;
        this.reservations = new ArrayList<>();
    }

    // Getters și Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public List<String> getReservations() {
        return reservations;
    }

    public void setReservations(List<String> reservations) {
        this.reservations = reservations;
    }
}
