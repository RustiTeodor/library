package com.example.library.model;

import java.util.List;

public class MagazineDetails extends Publication {
    private String publisher;

    public MagazineDetails() {
        super();
    }

    public MagazineDetails(String id, String title, List<ReadableItem> copies, String publisher) {
        super(id, title, copies);
        this.publisher = publisher;
    }

    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
}