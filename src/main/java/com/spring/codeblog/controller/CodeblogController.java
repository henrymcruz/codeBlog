package com.spring.codeblog.controller;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.service.CodeblogService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CodeblogController {

    @Autowired
    private CodeblogService codeblogService;

    @GetMapping("/posts")
    public String getPosts(Model model) {
        List<Post> posts = codeblogService.findAll();
        model.addAttribute("posts", posts);
        return "posts";  // nome da view posts.html
    }

    @GetMapping("/posts/{id}")
    public String getPostDetails(@PathVariable("id") Long id, Model model) {
        Post post = codeblogService.findById(id);
        if (post == null) {
            return "redirect:/posts";  // se não achar o post, redireciona
        }
        model.addAttribute("post", post);
        return "postDetails";  // nome da view postDetails.html
    }

    @GetMapping("/newpost")
    public String getPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "postForm";  // nome da view postForm.html
    }

    @PostMapping("/newpost")
    public String savePost(@Valid Post post, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("post", post);
            return "postForm";  // volta pro form mostrando erros
        }
        post.setData(LocalDate.now());
        codeblogService.save(post);
        return "redirect:/posts";  // se OK, redireciona para lista
    }
}
