package com.bootcamp.reto2.controller;

import com.bootcamp.reto2.entities.Comment;
import com.bootcamp.reto2.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("comment")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/")
    public Comment save(@RequestBody Comment comment){
        return commentRepository.save(comment);
    }

}
