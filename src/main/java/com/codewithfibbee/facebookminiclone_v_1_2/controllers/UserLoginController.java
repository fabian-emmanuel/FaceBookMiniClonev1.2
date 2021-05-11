package com.codewithfibbee.facebookminiclone_v_1_2.controllers;

import com.codewithfibbee.facebookminiclone_v_1_2.models.Post;
import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import com.codewithfibbee.facebookminiclone_v_1_2.services.PostService;
import com.codewithfibbee.facebookminiclone_v_1_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserLoginController {

    @Autowired
    UserService userService;
    @Autowired
    PostService postService;


    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("invalidEmail", null);
        return "signUpAndLogin";
    }

    //Log in

    @PostMapping("/login")
    public String login(User user, Model model, HttpSession httpSession){
        User newUser = userService.getUserByEmail(user.getEmail());
        if (newUser == null ){
            model.addAttribute("invalidEmail", "Email does not exist");
            return "signUpAndLogin";
        }
        newUser = userService.getuserByEmailAndPassWord(user.getEmail(), user.getPassword());
        if(newUser == null ){
            model.addAttribute("badPassword", "Incorrect password");
            return "signUpAndLogin";
        }
        httpSession.setAttribute("user", newUser);
        return "redirect:/homepage";
    }

    @GetMapping("/homepage")
    public String homePage(HttpSession httpSession, Model model){
        User user = (User) httpSession.getAttribute("user");
        model.addAttribute("post", new Post());
        model.addAttribute("allPost", postService.getAllPost());
        model.addAttribute("user", user);
        return "profile";
    }

    //Log Out
    @GetMapping("/logout")
    public String logout(Model model, HttpSession httpSession){
        if(httpSession != null){
            httpSession.invalidate();
        }
        model.addAttribute("user", new User());
        model.addAttribute("invalidEmail", null);
        return "redirect:/login";
    }
}

