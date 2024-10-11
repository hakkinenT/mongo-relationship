package com.example.mongorelations.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.*;

@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String isbn13;
    private String title;
    private int pages;

    @DocumentReference(lazy = true)
    private Publisher publisher;

    @DocumentReference(lazy = true)
    private List<Author> authors = new ArrayList<>();

    public Book() {
    }

    public Book(String id, String isbn13, String title, int pages) {
        this.id = id;
        this.isbn13 = isbn13;
        this.title = title;
        this.pages = pages;
    }

    public Book(String id, String isbn13, String title, int pages, Publisher publisher) {
        this.id = id;
        this.isbn13 = isbn13;
        this.title = title;
        this.pages = pages;
        this.publisher = publisher;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    
    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
