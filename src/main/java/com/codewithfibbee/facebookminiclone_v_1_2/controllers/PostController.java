package com.codewithfibbee.facebookminiclone_v_1_2.controllers;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import com.codewithfibbee.facebookminiclone_v_1_2.services.CommentService;
import com.codewithfibbee.facebookminiclone_v_1_2.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    CommentService commentService;

    @PostMapping("/post")
    public String newPost(HttpSession httpSession, @Validated Post post){
        User user = (User)httpSession.getAttribute("user");
        if (user == null)
            return "signUpAndLogin";
        postService.createPost(post, user);
        return "redirect:/homepage";
    }

    @PostMapping("/delete")
    public String deletePost(HttpSession httpSession, Long id){
        User user = (User) httpSession.getAttribute("user");
        if(user == null)
            return "profile";
        Post post = postService.getPostById(id);
        postService.deletePost(post);
        return "redirect:/homepage";
    }

}
