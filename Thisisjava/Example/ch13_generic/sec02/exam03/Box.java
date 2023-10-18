package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec02.exam03;

public class Box<T> {
    public T content;

    // compare 메소드에 제네릭 타입이 존재한다.
    // Box<T>와 other(다른 매개변수) 비교
    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
