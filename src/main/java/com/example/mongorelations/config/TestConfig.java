package com.example.mongorelations.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.mongorelations.entities.Address;
import com.example.mongorelations.entities.Author;
import com.example.mongorelations.entities.Book;
import com.example.mongorelations.entities.Publisher;
import com.example.mongorelations.repositories.AddressRepository;
import com.example.mongorelations.repositories.AuthorRepository;
import com.example.mongorelations.repositories.BookRepository;
import com.example.mongorelations.repositories.PublisherRepository;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private AuthorRepository authorRepository;
    
    @Autowired
    private AddressRepository addressRepository;


    @PostConstruct
    public void init(){
        /*publisherRepository.deleteAll();
        bookRepository.deleteAll();
        addressRepository.deleteAll();
        authorRepository.deleteAll();

        Address address = new Address();
        address.setStreet("Minha rua");
        address = addressRepository.insert(address);

        Author author = new Author();
        author.setName("Author 1");
        author.setAddress(address);
        author = authorRepository.insert(author);

        Address address2 = new Address();
        address2.setStreet("Minha rua 2");
        address2 = addressRepository.insert(address2);

        Author author2 = new Author();
        author2.setName("Author 2");
        author2.setAddress(address2);
        author2 = authorRepository.insert(author2);


        Publisher publisher = new Publisher();
        publisher.setName("publisher 1");
        publisher.setArconym("pb");
        publisher.setFoundationYear(1998);

        publisher = publisherRepository.insert(publisher);

        Book book = new Book();
        book.setIsbn13("1234567890324");
        book.setTitle("Book 1");
        book.setPages(100);
        book.setPublisher(publisher);
        book.getAuthors().add(author);
        book.getAuthors().add(author2);

        Book book2 = new Book();
        book2.setIsbn13("0987654321657");
        book2.setTitle("Book 2");
        book2.setPages(200);
        book2.setPublisher(publisher);
        book2.getAuthors().add(author);

        book = bookRepository.insert(book);
        book2 = bookRepository.insert(book2);*/

        /*publisher.getBooks().add(book);
        publisher.getBooks().add(book2);
        publisherRepository.save(publisher);*/


        /*book = bookRepository.findByTitle("Book 1");
        System.out.println("Titulo: " + book.getTitle());
        System.out.println("Publisher: " + book.getPublisher().getName());
        for(Author at : book.getAuthors()){
            System.out.println("Nome do autor: " + at.getName());
            System.out.println("Endereço: " + at.getAddress().getStreet());
        }*/

        // One-to-One: Tentativa de inserir o mesmo endereço pra autor diferente
        // Erro de chave duplicada
        
        /*Address address3 = addressRepository.findByStreet("Minha rua 2");
        Author author3 = new Author();
        author3.setName("Author 3");
        author3.setAddress(address3);
        author3 = authorRepository.insert(author3);*/

    }
}
