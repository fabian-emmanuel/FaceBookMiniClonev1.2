package com.codewithfibbee.facebookminiclone_v_1_2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(nullable = false)
    private String postMessage;

    @ManyToOne
    private User user;

    @OneToMany
    private List<LikesForPost> likesForPost = new ArrayList<>();

    @ManyToOne
    private Comment comment;
}
