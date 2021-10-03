package com.example.album.resource;


import com.example.album.model.Comment;
import com.example.album.model.Photo;
import com.example.album.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }


    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

    @GetMapping("/comment/createdBy")
    public List<Comment> getCommentByCreator(@RequestParam(name = "craetedBy") String  createdBy){
        return commentService.getPhotoByCreator(createdBy);
    }

    @PutMapping("/comment/{id}")
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/comment")
    public void deleteComment(@RequestParam(name = "Id") String id){
        commentService.deleteComment(id);
    }
}
