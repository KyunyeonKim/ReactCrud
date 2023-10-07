package com.boardback.boardback.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="board")
@DynamicInsert
@DynamicUpdate
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer no ;

    @Column(name = "type")
    private String type;

    @Column(name="title")
    private String title;

    @Column(name="contents")
    private String contents;

    @Column(name="member_no")
    private Integer memberNo;




}
