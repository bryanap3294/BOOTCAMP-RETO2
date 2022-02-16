package com.bootcamp.reto2.repository;

import com.bootcamp.reto2.entities.Author;
import com.bootcamp.reto2.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Long> {

}
