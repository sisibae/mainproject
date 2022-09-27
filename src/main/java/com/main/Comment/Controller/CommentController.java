package com.main.Comment.Controller;

import com.main.Comment.Dto.CommentPutDto;
import com.main.Comment.Entity.Comment;
import com.main.Comment.Dto.CommentPostDto;
import com.main.Comment.Mapper.CommentMapper;
import com.main.Comment.Service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/admin/rev")
public class CommentController {

    private final CommentService commentService;
    private final CommentMapper mapper;


    public CommentController(CommentService CommentService, CommentService commentService, CommentMapper mapper) {
        this.commentService = commentService;
        this.mapper = mapper;
    }

    //댓글등록
    @PostMapping
    public ResponseEntity postComment(@RequestBody CommentPostDto commentPostDto )  {
//        Comment comment = mapper.commentPostDtoToComment(commentPostDto);
//        commentService.createComment(comment);
       commentPostDto.getComment();
       commentPostDto.getWriter();

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    //댓글수정
    @PutMapping("/{comment-id}")
    public ResponseEntity putComment(@PathVariable("comment-id") long comment_id,
                                    @RequestBody CommentPutDto commentPutDto) {
        commentPutDto.setComment_id(comment_id);
        commentService.updateComment(mapper.CommentPutDtoTocomment(commentPutDto));
        return new ResponseEntity(HttpStatus.OK);
    }

    //댓글조회
    @GetMapping("/{comment-id}")
    public ResponseEntity<Comment> getComment(@PathVariable("comment-id")long comment_id) {
        Optional<Comment> comment = commentService.findComment(comment_id);
        return new ResponseEntity(comment,HttpStatus.OK);
    }

    //댓글전체조회
    @GetMapping
    public ResponseEntity getComment() {
        List<Comment> response = commentService.findComments();
        return new ResponseEntity(response,HttpStatus.OK);
    }

    //댓글삭제
    @DeleteMapping("/{comment-id}")
    public ResponseEntity deleteComment(@PathVariable("comment-id")long comment_id) {
        commentService.deleteComment(comment_id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}

//ResponseEntity putComment