package com.example.mongorelations.dto;

import com.example.mongorelations.entities.Author;

public class AuthorMinDTO {
    private String id;
    private String name;
    
    public AuthorMinDTO() {
    }

    public AuthorMinDTO(String id, String name, AddressDTO address) {
        this.id = id;
        this.name = name;
    }

    public AuthorMinDTO(Author entity) {
        this.id = entity.getId();
        this.name = entity.getName();
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
    
    
}
