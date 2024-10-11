package com.example.mongorelations.dto;

import com.example.mongorelations.entities.Publisher;

public class PublisherDTO {
    private String id;
    private String name;
    private String arconym;
    private int foundationYear;

    public PublisherDTO() {
    }

    public PublisherDTO(String id, String name, String arconym, int foundationYear) {
        this.id = id;
        this.name = name;
        this.arconym = arconym;
        this.foundationYear = foundationYear;
    }

    public PublisherDTO(Publisher entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.arconym = entity.getArconym();
        this.foundationYear = entity.getFoundationYear();
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

    
}
