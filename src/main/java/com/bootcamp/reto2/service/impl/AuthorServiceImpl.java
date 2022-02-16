package com.bootcamp.reto2.service.impl;

import com.bootcamp.reto2.entities.Author;
import com.bootcamp.reto2.entities.Blog;
import com.bootcamp.reto2.entities.Comment;
import com.bootcamp.reto2.entities.Post;
import com.bootcamp.reto2.repository.AuthorRepository;
import com.bootcamp.reto2.service.AuthorService;
import com.bootcamp.reto2.service.BlogService;
import com.bootcamp.reto2.service.CommentService;
import com.bootcamp.reto2.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BlogService blogService;

    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;


    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author save(Author author) {

        if (author.getAge()<18){
            author.setBlogList(new ArrayList<>());
        }
        if(author.getBlogList().size()>3){
            throw new RuntimeException("un author puede tener 3 blogs como maximo");
        }
        return authorRepository.save(author);
    }

    @Override
    public void delete(Long id) {

        Author author= this.findById(id);

        for(Blog blog: author.getBlogList()){
            for(Post post: blog.getPostList()){
                for(Comment comment: post.getCommentList()){
                    commentService.delete(comment);
                }
                postService.delete(post);
            }
            blogService.delete(blog);
        }
        authorRepository.deleteById(id);
    }

    @Override
    public Author findById(Long id) {
        return authorRepository.findById(id).get();
    }
}
