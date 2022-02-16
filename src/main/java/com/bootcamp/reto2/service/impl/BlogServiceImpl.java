package com.bootcamp.reto2.service.impl;

import com.bootcamp.reto2.entities.Author;
import com.bootcamp.reto2.entities.Blog;
import com.bootcamp.reto2.repository.BlogRepository;
import com.bootcamp.reto2.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void delete(Blog blog) {
        blogRepository.delete(blog);
    }

}
