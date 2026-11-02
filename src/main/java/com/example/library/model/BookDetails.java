package com.example.library.model;

import java.util.List;

public class BookDetails extends Publication {
    private List<BookAuthor> bookAuthors;
    private int pageCount;
    private String language;

    public BookDetails() { super(); }

    public BookDetails(String id, String title, List<ReadableItem> copies, int pageCount, String language, List<BookAuthor> bookAuthors) {
        super(id, title, copies);
        this.pageCount = pageCount;
        this.language = language;
        this.bookAuthors = bookAuthors;
    }

    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public List<BookAuthor> getBookAuthors() { return bookAuthors; }
    public void setBookAuthors(List<BookAuthor> bookAuthors) { this.bookAuthors = bookAuthors; }
}