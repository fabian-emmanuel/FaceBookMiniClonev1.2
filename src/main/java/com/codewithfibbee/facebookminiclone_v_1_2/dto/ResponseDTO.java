package com.codewithfibbee.facebookminiclone_v_1_2.dto;

import com.codewithfibbee.facebookminiclone_v_1_2.models.User;
import lombok.Data;

@Data
public class ResponseDTO {
    private String message;
    private User user;
    private boolean status;
}
