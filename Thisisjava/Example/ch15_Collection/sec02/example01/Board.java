package com.mystudy.scanner.Thisisjava.Example.ch15_Collection.sec02.example01;

import lombok.*;


public class Board {
    // 필드 선언
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    // @AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자 생성
    // @Getter @Setter : Getter, Setter 생성
}
