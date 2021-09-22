package com.example.album.Service;


import com.example.album.Repository.CommentRepository;
import com.example.album.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    private static CommentRepository commentRepository;

    public static Comment saveComment(Comment album) {
        return commentRepository.saveComment(album);
    }

    public Comment getComment(){
        return commentRepository.getComment();
    }

    public List<Comment> getAllComments() {
        return commentRepository.getAllComment();
    }

    public Comment getCommentById(int Id) {
        return commentRepository.getCommentbyId(Id);
    }

    public Comment updateComment(int Id, Comment album) {
        return commentRepository.updateComment(Id,album);
    }

    public Comment deleteComment(int Id) {
        return commentRepository.deleteComment(Id);
    }
}
