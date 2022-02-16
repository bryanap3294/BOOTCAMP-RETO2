package com.bootcamp.reto2.service.impl;

import com.bootcamp.reto2.entities.Comment;
import com.bootcamp.reto2.entities.Post;
import com.bootcamp.reto2.repository.CommentRepository;
import com.bootcamp.reto2.service.CommentService;
import com.bootcamp.reto2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private PostService postService;


    @Override
    public Comment save(Comment comment) {

        Post post = postService.findById(comment.getPost().getId());
        List<Comment> commentList = post.getCommentList();
        commentList.add(comment);
        post.setCommentList(commentList);
        if(!post.getStatus().equals("PUBLICADO")){
            throw new RuntimeException("Solo se deben aregar comentarios en posts publicados");
        }
        postService.save(post);

        return comment;
    }

    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}
