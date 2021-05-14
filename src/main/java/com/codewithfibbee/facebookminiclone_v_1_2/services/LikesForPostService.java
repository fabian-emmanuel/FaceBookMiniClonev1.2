package com.codewithfibbee.facebookminiclone_v_1_2.services;

import com.codewithfibbee.facebookminiclone_v_1_2.models.LikesForPost;

public interface LikesForPostService {

    LikesForPost getLikes(LikesForPost likes);

    void deleteLike(LikesForPost like);

    void addLike(LikesForPost like);
}
