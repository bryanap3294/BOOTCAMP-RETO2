package com.bootcamp.reto2.service;

import com.bootcamp.reto2.entities.Comment;
import com.bootcamp.reto2.entities.Post;

public interface CommentService {

    Comment save(Comment comment);
    void delete(Comment comment);

}
