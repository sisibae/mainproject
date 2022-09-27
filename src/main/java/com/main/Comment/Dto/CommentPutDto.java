package com.main.Comment.Dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentPutDto {

    private Long comment_id;
    private String writer;
    private String date;


}


