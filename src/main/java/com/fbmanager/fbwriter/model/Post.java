package com.fbmanager.fbwriter.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "post_time")
    private LocalDateTime postTime;

    @Column(name = "content")
    private String content;

    @Column(name = "created")
    private Timestamp created;
}
