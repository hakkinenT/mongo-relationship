package com.example.mongorelations.dto;

import com.example.mongorelations.entities.Author;

public class AuthorDTO {
    private String id;
    private String name;
    private AddressDTO address;
    
    public AuthorDTO() {
    }

    public AuthorDTO(String id, String name, AddressDTO address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public AuthorDTO(Author entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.address = new AddressDTO(entity.getAddress());
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

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }
    
    
}
