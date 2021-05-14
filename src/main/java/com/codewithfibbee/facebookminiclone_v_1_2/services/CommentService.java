package com.codewithfibbee.facebookminiclone_v_1_2.services;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Comment;
import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;

import java.util.List;

public interface CommentService {
    void createComment(Comment comment);
    Comment getCommentById(Long id);
    void updateComment(Comment comment, Long id);
    void deleteComment(Comment comment);
}
