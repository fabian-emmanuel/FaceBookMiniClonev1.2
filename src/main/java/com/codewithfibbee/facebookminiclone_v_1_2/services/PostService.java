package com.codewithfibbee.facebookminiclone_v_1_2.services;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;

import java.util.List;

public interface PostService {
    void createPost(Post post, User user);
    List<Post> getAllPost();
    Post getPostById(Long id);
    void deletePost(Post post);
    void updatePost(Post post, long id);
}
