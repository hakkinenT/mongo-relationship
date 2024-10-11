package com.example.mongorelations.controllers;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.mongorelations.dto.PublisherDTO;
import com.example.mongorelations.services.PublisherService;

@RestController
@RequestMapping(value = "/publishers")
public class PublisherController {
    @Autowired
    private PublisherService publisherService;

    @GetMapping("/{id}")
    public ResponseEntity<PublisherDTO> findById(@PathVariable String id) {
        PublisherDTO publisher = publisherService.findById(id);
        return ResponseEntity.ok(publisher);
    }

    @PostMapping
    public ResponseEntity<PublisherDTO> insert(@RequestBody PublisherDTO dto) {
        dto = publisherService.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
