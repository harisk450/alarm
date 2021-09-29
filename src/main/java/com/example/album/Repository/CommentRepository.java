package com.example.album.Repository;

import com.example.album.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment,String> {

    List<Comment> findbyCreator(String createdBy);
}
