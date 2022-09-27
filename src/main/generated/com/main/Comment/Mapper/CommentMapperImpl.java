package com.main.Comment.Mapper;

import com.main.Comment.Dto.CommentPostDto;
import com.main.Comment.Dto.CommentPutDto;
import com.main.Comment.Entity.Comment;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-27T16:05:59+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15.1 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment commentPostDtoToComment(CommentPostDto commentPostDto) {
        if ( commentPostDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        return comment;
    }

    @Override
    public Comment CommentPutDtoTocomment(CommentPutDto commentPutDto) {
        if ( commentPutDto == null ) {
            return null;
        }

        Comment comment = new Comment();

        return comment;
    }
}
