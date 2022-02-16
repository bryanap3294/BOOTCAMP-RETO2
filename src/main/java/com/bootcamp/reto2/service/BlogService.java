package com.bootcamp.reto2.service;

import com.bootcamp.reto2.entities.Blog;

import java.util.List;

public interface BlogService {

    List<Blog> findAll();
    Blog save(Blog blog);
    Blog findById(Long id);
    void delete(Blog blog);

}
