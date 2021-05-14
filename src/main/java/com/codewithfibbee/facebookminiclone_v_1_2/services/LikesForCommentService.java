package com.codewithfibbee.facebookminiclone_v_1_2.services;

import com.codewithfibbee.facebookminiclone_v_1_2.models.LikesForComment;

public interface LikesForCommentService {
    LikesForComment getLikes(LikesForComment like);

    void deleteLike(LikesForComment like);

    void addLike(LikesForComment like);
}
