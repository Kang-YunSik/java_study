package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec02;

//제네릭 타입
public class Product<K,M> {

    //필드 선언
    private K kind;
    private M model;

    //메소드 선언
    //메소드의 리턴 값과 매개변수 값의 타입을 타입 파라미터로 사용
    public K getKind() {
        return this.kind;
    }
    public M getModel() {
        return this.model;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
