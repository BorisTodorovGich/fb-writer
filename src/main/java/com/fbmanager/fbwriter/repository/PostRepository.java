package com.fbmanager.fbwriter.repository;

import com.fbmanager.fbwriter.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer>{
}
