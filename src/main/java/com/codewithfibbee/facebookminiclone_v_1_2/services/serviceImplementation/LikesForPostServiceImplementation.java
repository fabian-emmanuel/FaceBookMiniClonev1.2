package com.codewithfibbee.facebookminiclone_v_1_2.services.serviceImplementation;

import com.codewithfibbee.facebookminiclone_v_1_2.models.LikesForPost;
import com.codewithfibbee.facebookminiclone_v_1_2.repositories.LikesForPostRepository;
import com.codewithfibbee.facebookminiclone_v_1_2.services.LikesForPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikesForPostServiceImplementation implements LikesForPostService {
    @Autowired
    LikesForPostRepository likesForPostRepository;
    @Override
    public LikesForPost getLikes(LikesForPost like) {
        return likesForPostRepository.findByUserAndPost(like.getUser(), like.getPost());
    }

    @Override
    public void deleteLike(LikesForPost like) {
        likesForPostRepository.delete(like);
    }

    @Override
    public void addLike(LikesForPost like) {
        likesForPostRepository.save(like);
    }
}
