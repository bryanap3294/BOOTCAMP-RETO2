package com.bootcamp.reto2.controller;

import com.bootcamp.reto2.entities.Author;
import com.bootcamp.reto2.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/")
    public List<Author> findAll(){
        return authorService.findAll();
    }

    @PostMapping("/")
    public Author save(@RequestBody Author author){
        return authorService.save(author);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        authorService.delete(id);
    }
}
