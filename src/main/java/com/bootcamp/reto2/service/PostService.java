package com.bootcamp.reto2.service;

import com.bootcamp.reto2.entities.Blog;
import com.bootcamp.reto2.entities.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();
    Post save(Post post);
    Post findById(Long id);
    void delete(Post post);

}
