package com.example.album.Resource;

import com.example.album.Service.CommentService;
import com.example.album.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentResource {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments(){
        return  commentService.getAllComments();
    }

    @PutMapping
    public Comment updateComment(@RequestBody Comment comment){
        return commentService.updateCommnet(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "id") String id){
        commentService.deleteComment(id);
    }

    @GetMapping
    public List<Comment> getCommentByCreator(@RequestParam(name = "createdBy") String createdBy){
        return commentService.getCommentByCreator(createdBy);
    }

}
