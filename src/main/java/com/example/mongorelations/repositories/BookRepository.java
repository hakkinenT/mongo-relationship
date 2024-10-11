package com.example.mongorelations.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongorelations.entities.Book;

public interface BookRepository extends MongoRepository<Book, String>{
    Book findByTitle(String title);
}
