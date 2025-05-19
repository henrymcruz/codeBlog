package com.spring.codeblog.repository;

import com.spring.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeblogRepository extends JpaRepository<Post, Long> {

}
