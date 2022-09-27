package com.main.Comment.Service;


import com.main.Comment.Entity.Comment;
import com.main.Comment.Repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public void createComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void updateComment(Comment comment){
        commentRepository.save(comment);
    }

    public Optional<Comment> findComment(long comment_id) {
        return commentRepository.findById(comment_id);}

    public List<Comment> findComments() {
        return commentRepository.findAll();
    }
    public void deleteComment(long comment_id) {
        commentRepository.deleteById(comment_id);
    }
}
