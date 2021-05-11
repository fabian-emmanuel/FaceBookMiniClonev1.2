package com.codewithfibbee.facebookminiclone_v_1_2.services.serviceImplementation;

import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import com.codewithfibbee.facebookminiclone_v_1_2.repositories.UserRepository;
import com.codewithfibbee.facebookminiclone_v_1_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void registerUser(User user) {
        userRepository.save(user);

    }

    @Override
    public User getuserByEmailAndPassWord(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}
