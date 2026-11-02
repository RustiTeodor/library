package com.example.library.model;

import java.util.List;

public class Author {
    private String id;
    private String name;
    private List<BookAuthor> books;
    private int birthYear;
    private String nationality;

    public Author() {}

    public Author(String id, String name, int birthYear, String nationality, List<BookAuthor> books) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.nationality = nationality;
        this.books = books;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public List<BookAuthor> getBooks() { return books; }
    public void setBooks(List<BookAuthor> books) { this.books = books; }
}