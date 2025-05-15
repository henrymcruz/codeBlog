package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.CodeblogService;

import java.util.List;

public class CodeblogServiceImpl implements CodeblogService {
    @Override
    public List<Post> findAll() {
        return List.of();
    }

    @Override
    public Post findById(Long id) {
        return null;
    }

    @Override
    public Post save(Post post) {
        return null;
    }
}
