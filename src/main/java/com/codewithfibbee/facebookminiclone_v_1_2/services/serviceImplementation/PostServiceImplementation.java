package com.codewithfibbee.facebookminiclone_v_1_2.services.serviceImplementation;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import com.codewithfibbee.facebookminiclone_v_1_2.repositories.PostRepository;
import com.codewithfibbee.facebookminiclone_v_1_2.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImplementation implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public void createPost(Post post, User user) {
        post.setUser(user);
        postRepository.save(post);
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findPostById(id);
    }

    @Override
    public void deletePost(Post post) {
        postRepository.delete(post);
    }

}
