package com.example.mongorelations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongorelations.dto.PublisherDTO;
import com.example.mongorelations.entities.Publisher;
import com.example.mongorelations.exceptions.customs.ResourceNotFoundException;
import com.example.mongorelations.repositories.PublisherRepository;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public PublisherDTO findById(String id){
        Publisher publisher = publisherRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new PublisherDTO(publisher);
    }

    public PublisherDTO insert(PublisherDTO dto){
        Publisher publisher = new Publisher();
        publisher.setName(dto.getName());
        publisher.setArconym(dto.getArconym());
        publisher.setFoundationYear(dto.getFoundationYear());

        publisher = publisherRepository.insert(publisher);

        return new PublisherDTO(publisher);
    }
}
