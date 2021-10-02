package com.example.album.service;

import com.example.album.model.Comment;
import com.example.album.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }


    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }

    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentByCreator(String createdBy) {
        return commentRepository.findAllByCreator(createdBy);
    }

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
}
