package com.example.mongorelations.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongorelations.dto.AddressDTO;
import com.example.mongorelations.entities.Address;
import com.example.mongorelations.repositories.AddressRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;

    public AddressDTO insert(AddressDTO dto){
        Address address = new Address();
        address.setStreet(dto.getStreet());

        address = addressRepository.insert(address);

        return new AddressDTO(address);
    }
}
