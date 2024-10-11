package com.example.mongorelations.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongorelations.entities.Address;

public interface AddressRepository extends MongoRepository<Address, String>{
    Address findByStreet(String street);
}
