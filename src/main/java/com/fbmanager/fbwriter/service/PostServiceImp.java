package com.fbmanager.fbwriter.service;

import com.fbmanager.fbwriter.model.Post;
import com.fbmanager.fbwriter.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImp implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Iterable<Post> getPosts() {

        return postRepository.findAll();
    }
}
