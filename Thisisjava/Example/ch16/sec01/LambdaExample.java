package com.mystudy.scanner.Thisisjava.Example.ch16.sec01;

public class LambdaExample {
    public static void main(String[] args) {
        // 람다함수 정의1
        action((x,y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        // 람다함수 정의2
        action((x,y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        });
    }

    // action() 메소드 정의
    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;
        calculable.calculate(x,y);
    }
}
