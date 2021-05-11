package com.codewithfibbee.facebookminiclone_v_1_2.services;

import com.codewithfibbee.facebookminiclone_v_1_2.models.User;

public interface UserService {
    User getUserByEmail(String email);
    void registerUser(User user);
    User getuserByEmailAndPassWord(String email, String password);
}
