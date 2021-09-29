package com.example.album.Service;

import com.example.album.Repository.CommentRepository;
import com.example.album.model.Comment;
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

    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    public Comment updateCommnet(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteComment(String id) {
        commentRepository.deleteById(id);
    }

    public List<Comment> getCommentByCreator(String createdBy) {
        return commentRepository.findbyCreator(createdBy);
    }
}
