package com.example.mongorelations.dto;

import com.example.mongorelations.entities.Address;

public class AddressDTO {
    private String id;
    private String street;
    
    public AddressDTO() {
    }

    public AddressDTO(String id, String street) {
        this.id = id;
        this.street = street;
    }

    public AddressDTO(Address address) {
        this.id = address.getId();
        this.street = address.getStreet();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    
}
