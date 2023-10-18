package com.mystudy.scanner.Thisisjava.Example.ch15_Collection.sec02.example03;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        // ArrayList 컬렉션 객체 생성
        List<String> list1 = new ArrayList<>();
        // LinkedList 컬렉션 객체 생성
        List<String> list2 = new LinkedList<>();

        // 변수 선언
        long startTime;
        long endTime;

        // ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i=0; i<10000; i++){
            // ArrayList[0]에 시간 값을 계속 추가함.(빈번한 삽입) -> 인덱스가 계속 밀려남
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간: ", (endTime-startTime));

        // LinkedList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for (int i=0; i<10000; i++){
            // LinkedList[0]에 시간 값을 계속 추가하지만, 링크로 연결되어 있어 삽입에서 ArrayList보다 성능이 좋다.
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.printf("%-17s %8d ns \n", "ArrayList 걸린시간: ", (endTime-startTime));

    }
}
