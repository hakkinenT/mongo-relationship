package com.example.mongorelations.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongorelations.entities.Author;

public interface AuthorRepository extends MongoRepository<Author, String>{
    Optional<Author> findByName(String name);
}
