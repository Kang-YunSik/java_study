package com.study.java.Calculator;

import java.util.Scanner;

public class Calculator {

    void powerOn(){
        System.out.println("[계산기 프로그램 실행]");
    }

    String inputGiho() {
            System.out.println("원하는 연산을 입력하세요(+, -, *, /)");

            Scanner giho = new Scanner(System.in);
            String yourGiho = giho.nextLine();
            String result = yourGiho;
            return result;
        }

    int inputFristValue() {
        System.out.println("첫 번째 인수를 입력하세요(정수만 입력)");

        Scanner value1 = new Scanner(System.in);
        int FristValue = value1.nextInt();
        int result = FristValue;
        return result;
    }

    int inputSecondValue() {
        System.out.println("두 번째 인수를 입력하세요(정수만 입력)");

        Scanner value2 = new Scanner(System.in);
        int SecondValue = value2.nextInt();
        int result = SecondValue;
        return result;
    }


    int plus(int insu1, int insu2){
        int result = insu1 + insu2;
        return result;
    }

    int minus(int insu1, int insu2){
        int result = insu1 - insu2;
        return result;
    }

    double divide(int insu1, int insu2){
        double result = (double)insu1 / insu2;
        return result;
    }

    int cross(int insu1, int insu2){
        int result = insu1 * insu2;
        return result;
    }
}
