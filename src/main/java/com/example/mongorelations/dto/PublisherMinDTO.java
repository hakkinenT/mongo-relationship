package com.example.mongorelations.dto;

import com.example.mongorelations.entities.Publisher;

public class PublisherMinDTO {
    private String id;
    private String name;

    public PublisherMinDTO() {
    }

    public PublisherMinDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public PublisherMinDTO(Publisher entity) {
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
