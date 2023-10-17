package com.mystudy.scanner.Thisisjava.Example.ch13_generic.sec02.exam03;

public class GenericExample {
    public static void main(String[] args) {
        // T는 Object 이므로 String, Integer 모두 할당할 수 있다.

        // String
        Box box1 = new Box();
        box1.content = "100";

        Box box2 = new Box();
        box2.content = "100";

        // Integer
        Box box3 = new Box();
        box3.content = 100;


        boolean result1 = box1.compare(box2);
        System.out.println("result1: "+result1); // true

        boolean result2 = box1.compare(box3);
        System.out.println("result2: "+result2); // false
    }
}
