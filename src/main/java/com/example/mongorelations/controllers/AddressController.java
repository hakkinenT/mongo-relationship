package com.example.mongorelations.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.mongorelations.dto.AddressDTO;
import com.example.mongorelations.services.AddressService;

@RestController
@RequestMapping(value = "/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResponseEntity<AddressDTO> insert(@RequestBody AddressDTO dto){
        dto = addressService.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
