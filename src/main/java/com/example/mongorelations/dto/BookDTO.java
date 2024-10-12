package com.example.mongorelations.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.mongorelations.entities.Author;
import com.example.mongorelations.entities.Book;

public class BookDTO {
    private String id;
    private String isbn13;
    private String title;
    private int pages;

    private PublisherMinDTO publisher;

    private List<AuthorMinDTO> authors = new ArrayList<>();

    public BookDTO() {
    }

    public BookDTO(String id, String isbn13, String title, int pages, PublisherMinDTO publisher) {
        this.id = id;
        this.isbn13 = isbn13;
        this.title = title;
        this.pages = pages;
        this.publisher = publisher;
    }

    public BookDTO(Book entity) {
        this.id = entity.getId();
        this.isbn13 = entity.getIsbn13();
        this.title = entity.getTitle();
        this.pages = entity.getPages();
        this.publisher = new PublisherMinDTO(entity.getPublisher());
        for(Author author : entity.getAuthors()){
            this.authors.add(new AuthorMinDTO(author));
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public PublisherMinDTO getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherMinDTO publisher) {
        this.publisher = publisher;
    }

    public List<AuthorMinDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorMinDTO> authors) {
        this.authors = authors;
    }

    
    
}
