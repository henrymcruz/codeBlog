package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    private CodeblogRepository codeblogRepository;

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll(sortByIdDesc());
    }

    @Override
    public Post findById(Long id) {
        return codeblogRepository.findById(id).orElse(null);
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }

    private Sort sortByIdDesc() {
        return Sort.by(Sort.Direction.DESC, "id");
    }
}
