package com.main.Comment.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long comment_id;

        @Column (columnDefinition = "TEXT", nullable = false)
        private String comment;

        @Column(nullable = false)
        private String writer;

        @Column(nullable = false)
        private String date;

    }

//columnDefinition = "TEXT",