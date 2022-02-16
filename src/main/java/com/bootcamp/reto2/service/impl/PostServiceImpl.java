package com.bootcamp.reto2.service.impl;

import com.bootcamp.reto2.entities.Blog;
import com.bootcamp.reto2.entities.Post;
import com.bootcamp.reto2.repository.BlogRepository;
import com.bootcamp.reto2.repository.PostRepository;
import com.bootcamp.reto2.service.BlogService;
import com.bootcamp.reto2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private BlogService blogService;


    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post save(Post post) {

        Blog blog = this.blogService.findById(post.getBlog().getId());
        if (!blog.getStatus().equals("activo")){
            throw new RuntimeException("Solo se deben aregar Posts en Blogs activos");
        }
        return postRepository.save(post);
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public void delete(Post post) {
        postRepository.delete(post);
    }
}
