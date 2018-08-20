package com.fbmanager.fbwriter.controller;

import com.fbmanager.fbwriter.model.Post;
import com.fbmanager.fbwriter.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    public PostService postService;

    @GetMapping(path = "/posts")
    public String getPosts(Model model){

        List<Post> posts = (List<Post>) postService.getPosts();

        model.addAttribute("posts", posts);

        return "getPosts";
    }
}
