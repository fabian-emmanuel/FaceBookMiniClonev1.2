package com.codewithfibbee.facebookminiclone_v_1_2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class LikesForComment {

    @Id
    @GeneratedValue
    private Long Id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Comment comment;
}
