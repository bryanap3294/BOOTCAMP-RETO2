package com.bootcamp.reto2.repository;

import com.bootcamp.reto2.entities.Blog;
import com.bootcamp.reto2.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
