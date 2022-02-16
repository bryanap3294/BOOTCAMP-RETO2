package com.bootcamp.reto2.controller;

import com.bootcamp.reto2.entities.Post;
import com.bootcamp.reto2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/")
    public List<Post> findAll(){
        return postService.findAll();
    }

    @GetMapping("/{id}")
    public Post findById(@PathVariable Long id){
        return postService.findById(id);
    }

    @PostMapping("/")
    public Post save(@RequestBody Post post){
        return postService.save(post);
    }

}
