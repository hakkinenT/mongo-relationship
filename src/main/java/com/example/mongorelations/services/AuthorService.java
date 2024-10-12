package com.example.mongorelations.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongorelations.dto.AuthorDTO;
import com.example.mongorelations.entities.Address;
import com.example.mongorelations.entities.Author;
import com.example.mongorelations.exceptions.customs.ExistingResourceException;
import com.example.mongorelations.repositories.AddressRepository;
import com.example.mongorelations.repositories.AuthorRepository;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AddressRepository addressRepository;

    public AuthorDTO insert(AuthorDTO dto){
        Author author = new Author();
        author.setName(dto.getName());

        createAddress(dto, author);

        author = authorRepository.insert(author);

        return new AuthorDTO(author);
    }

    private void createAddress(AuthorDTO dto, Author author) {
        checkAddressExists(dto);

        Address address = new Address();
        address.setStreet(dto.getAddress().getStreet());
        address = addressRepository.insert(address);
        author.setAddress(address);
    }

    private void checkAddressExists(AuthorDTO dto) {
        Optional<Address> address = addressRepository
            .findByStreet(dto.getAddress().getStreet());

        if(address.isPresent()){
            throw new ExistingResourceException("Endereço já cadastrado");
        }
    }
}
