package com.main.Comment.Mapper;


import com.main.Comment.Dto.CommentPostDto;
import com.main.Comment.Dto.CommentPutDto;
import com.main.Comment.Entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

//@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
//public interface CommentMapper {
//    Comment commentPostDtoToComment(CommentPostDto commentPostDto);
//    CommentPutDto commentToCommentPutDto(Comment comment);
//}

@Mapper(componentModel = "spring")
public interface CommentMapper {
    Comment commentPostDtoToComment(CommentPostDto commentPostDto);
    Comment CommentPutDtoTocomment(CommentPutDto commentPutDto);
}
