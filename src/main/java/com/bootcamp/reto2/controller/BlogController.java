package com.bootcamp.reto2.controller;

import com.bootcamp.reto2.entities.Blog;
import com.bootcamp.reto2.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public List<Blog> findAll(){
        return this.blogService.findAll();
    }

    @PostMapping
    public Blog save(@RequestBody Blog blog){
        return this.blogService.save(blog);
    }

}
