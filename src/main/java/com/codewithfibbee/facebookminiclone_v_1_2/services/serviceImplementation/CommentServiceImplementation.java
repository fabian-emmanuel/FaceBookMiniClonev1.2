package com.codewithfibbee.facebookminiclone_v_1_2.services.serviceImplementation;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Comment;
import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import com.codewithfibbee.facebookminiclone_v_1_2.repositories.CommentRepository;
import com.codewithfibbee.facebookminiclone_v_1_2.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService {
    @Autowired
    CommentRepository commentRepository;

    @Override
    public void createComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public void updateComment(Comment comment, Long id) {
        Comment oldComment = commentRepository.findCommentById(id);
        oldComment.setCommentMessage(comment.getCommentMessage());
        commentRepository.save(oldComment);
    }

    @Override
    public void deleteComment(Comment comment) {
        commentRepository.delete(comment);
    }

//    @Override
//    public List<Comment> getPostComments(Post post) {
//        return commentRepository.findAllByPost(post);
//    }
}
