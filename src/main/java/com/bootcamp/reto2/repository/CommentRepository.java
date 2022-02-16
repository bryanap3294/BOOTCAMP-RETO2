package com.bootcamp.reto2.repository;

import com.bootcamp.reto2.entities.Comment;
import com.bootcamp.reto2.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
