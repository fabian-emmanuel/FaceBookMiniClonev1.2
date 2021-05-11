package com.codewithfibbee.facebookminiclone_v_1_2.repositories;

import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}
