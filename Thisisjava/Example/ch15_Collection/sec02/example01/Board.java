package com.mystudy.scanner.Thisisjava.Example.ch15_Collection.sec02.example01;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Board {
    // 필드 선언
    private String subject;
    private String content;
    private String writer;

    // @AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자 생성
    // @Getter @Setter : Getter, Setter 생성
}
