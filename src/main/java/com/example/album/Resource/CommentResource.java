package com.example.album.Resource;

import com.example.album.Service.CommentService;
import com.example.album.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentResource {
    @Autowired
    private CommentService albumService;

    @GetMapping("/comment")
    public Comment getComment(){
        return albumService.getComment();
    }

    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return albumService.getAllComments();
    }

    @GetMapping("/comment/{Id}")
    public Comment getCommentById(@PathVariable("Id") int Id){
        return albumService.getCommentById(Id);
    }

    @PutMapping("/comment/{Id}")
    public Comment UpdateComment(@PathVariable("Id") int Id,@RequestBody Comment album){
        return albumService.updateComment(Id,album);
    }

    @PostMapping("/comment")
    public Comment saveComment(@RequestBody Comment album){
        albumService.saveComment(album);
        return album;
    }

    @DeleteMapping("/comment")
    public Comment deleteComment(@RequestParam(name = "Id") int Id){
        return albumService.deleteComment(Id);
    }

}
