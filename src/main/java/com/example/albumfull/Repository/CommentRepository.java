package com.example.albumfull.Repository;

import com.example.albumfull.model.Comment;



import java.util.ArrayList;
import java.util.List;


public class CommentRepository {
    public Comment getComment() {
        Comment comment = new Comment(12, 33432, "Nice pic0", "Linda", "12 April");
        return comment;
    }
    static List<Comment> commentList = new ArrayList();
    public static Comment saveComment(Comment user) {
        user.setId(commentList.size() + 1);
        commentList.add(user);
        return user;
    }

    public List<Comment> getAllComment() {
        return commentList;
    }

    public Comment getCommentbyId(int Id) {
        for (Comment user:commentList){
            if (user.getId()==Id){
                return user;
            }
        }
        return null;
    }

    public Comment updateComment(int Id,Comment user) {
        for (Comment a: commentList){
            if(a.getId()==Id){
                a.setPhotoId(a.getPhotoId());
                a.setMessage(a.getMessage());
                a.setCreatedBy(a.getCreatedBy());
                a.setDateCreated(a.getDateCreated());
                return a;
            }
        }
        return null;
    }

    public Comment deleteComment(int Id) {
        Comment deletedUser = null;
        for (Comment u: commentList){
            if(u.getId()==Id){
                deletedUser = u;
                commentList.remove(u);
                return deletedUser;
            }
        }
        return null;
    }
}
