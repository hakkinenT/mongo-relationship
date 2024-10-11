package com.example.mongorelations.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.*;

@Document(collection = "publishers")
public class Publisher {
    @Id
    private String id;
    private String name;
    private String arconym;
    private int foundationYear;

    @ReadOnlyProperty
    @DocumentReference(lookup="{'publisher':'?#{#self._id}'}")
    List<Book> books = new ArrayList<>();

    public Publisher() {
    }

    public Publisher(String id, String name, String arconym, int foundationYear) {
        this.id = id;
        this.name = name;
        this.arconym = arconym;
        this.foundationYear = foundationYear;
    }

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

    public String getArconym() {
        return arconym;
    }

    public void setArconym(String arconym) {
        this.arconym = arconym;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }
    
    public List<Book> getBooks() {
        return books;
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
        Publisher other = (Publisher) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
