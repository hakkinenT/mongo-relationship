package com.example.mongorelations.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongorelations.entities.Address;

public interface AddressRepository extends MongoRepository<Address, String>{
    Optional<Address> findByStreet(String street);
}
