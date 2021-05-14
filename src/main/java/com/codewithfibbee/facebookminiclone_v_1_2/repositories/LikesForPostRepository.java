package com.codewithfibbee.facebookminiclone_v_1_2.repositories;

import com.codewithfibbee.facebookminiclone_v_1_2.models.LikesForPost;
import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikesForPostRepository extends JpaRepository<LikesForPost, Long> {
    LikesForPost findByUserAndPost(User user, Post post);
}
