package com.example.mongorelations.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongorelations.entities.Publisher;

public interface PublisherRepository extends MongoRepository<Publisher, String>{
    Publisher findByName(String name);
}
