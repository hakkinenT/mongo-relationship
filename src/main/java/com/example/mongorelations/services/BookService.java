package com.example.mongorelations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongorelations.dto.AuthorMinDTO;
import com.example.mongorelations.dto.BookDTO;
import com.example.mongorelations.entities.Author;
import com.example.mongorelations.entities.Book;
import com.example.mongorelations.entities.Publisher;
import com.example.mongorelations.exceptions.customs.ResourceNotFoundException;
import com.example.mongorelations.repositories.AuthorRepository;
import com.example.mongorelations.repositories.BookRepository;
import com.example.mongorelations.repositories.PublisherRepository;

import java.util.*;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<BookDTO> findAll(){
        List<Book> books = bookRepository.findAll();
        return books.stream().map(book -> new BookDTO(book)).toList();
    }

    public BookDTO insert(BookDTO dto){
        Book book = new Book();
        book.setIsbn13(dto.getIsbn13());
        book.setPages(dto.getPages());
        book.setTitle(dto.getTitle());

        Publisher publisher = publisherRepository.findByName(dto.getPublisher().getName());
        book.setPublisher(publisher);

        for(AuthorMinDTO a : dto.getAuthors()){
            Author author = authorRepository.findByName(a.getName()).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
            book.getAuthors().add(author);
        }

        book = bookRepository.insert(book);
        return new BookDTO(book);
    }
}
