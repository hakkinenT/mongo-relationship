package com.example.mongorelations.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongorelations.entities.Author;

public interface AuthorRepository extends MongoRepository<Author, String>{

}
