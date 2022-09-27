package com.main.Comment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentVO {
    private Long comment_id;
    private String comment;
    private String writer;
    private String date;
}
