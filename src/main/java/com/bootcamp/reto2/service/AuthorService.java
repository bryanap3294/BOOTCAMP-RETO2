package com.bootcamp.reto2.service;

import com.bootcamp.reto2.entities.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();
    Author save(Author author);
    void delete(Long id);
    Author findById(Long id);

}
