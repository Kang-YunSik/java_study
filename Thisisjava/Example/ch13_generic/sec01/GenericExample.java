package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec01;

public class GenericExample {
    public static void main(String[] args) {

        //Box를 생성할 때 타입 파라미터 T대신 String으로 대체
        // box1 객체 String을 타입으로 받는다
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        // box2 객체는 Integer를 타입으로 받는다.
        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        Integer value = box2.content;
        System.out.println(value);

    }
}
