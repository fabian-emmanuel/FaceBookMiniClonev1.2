package com.codewithfibbee.facebookminiclone_v_1_2.services.serviceImplementation;

import com.codewithfibbee.facebookminiclone_v_1_2.models.LikesForComment;
import com.codewithfibbee.facebookminiclone_v_1_2.repositories.LikesForCommentRepository;
import com.codewithfibbee.facebookminiclone_v_1_2.services.LikesForCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesForCommentServiceImplementation implements LikesForCommentService {

    @Autowired
    LikesForCommentRepository likesForCommentRepository;

    @Override
    public LikesForComment getLikes(LikesForComment like) {
        return likesForCommentRepository.findByUserAndComment(like.getUser(), like.getComment());
    }

    @Override
    public void deleteLike(LikesForComment like) {
        likesForCommentRepository.delete(like);
    }

    @Override
    public void addLike(LikesForComment like) {
        likesForCommentRepository.save(like);
    }
}
