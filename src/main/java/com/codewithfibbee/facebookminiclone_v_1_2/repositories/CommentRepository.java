package com.codewithfibbee.facebookminiclone_v_1_2.repositories;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
