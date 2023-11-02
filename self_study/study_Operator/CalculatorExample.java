package com.study.java.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {

        //프로그램 시작 객체 생성 및 메소드 선언 (리턴값 없음)
        Calculator myCarl = new Calculator();
        myCarl.powerOn();

        //연산 입력 객체 생성 및 메소드 선언 (리턴값 사용자 입력 문자_+,-,*,/)
        Calculator ca1 = new Calculator();
        String giho = ca1.inputGiho();

        //첫 번째 변수 입력 객체 생성 및 메소드 선언 (리턴값 사용자 입력 정수)
        Calculator ca2 = new Calculator();
        int firstValue = ca2.inputFristValue();

        //두 번째 변수 입력 객체 생성 및 메소드 선언 (리턴값 사용자 입력 정수)
        Calculator ca3 = new Calculator();
        int secondValue = ca3.inputSecondValue();

        //연산 함수를 불러는 객체 생성 (리턴값은 연산 결과)
        Calculator ca4 = new Calculator();
        double result = 0;

        //사용자가 입력한 연산 기호에 따른 switch case문
        switch (giho) {
            case "+" : result=ca4.plus(firstValue,secondValue);
                System.out.println(firstValue+" "+giho+" "+secondValue+" = "+(int)result);
            break;
            case "-" : result=ca4.minus(firstValue,secondValue);
                System.out.println(firstValue+" "+giho+" "+secondValue+" = "+(int)result);
            break;
            case "*" : result=ca4.cross(firstValue,secondValue);
                System.out.println(firstValue+" "+giho+" "+secondValue+" = "+(int)result);
            break;
            case "/" : result=ca4.divide(firstValue,secondValue);
                System.out.println(firstValue+" "+giho+" "+secondValue+" = "+result);
            break;
        }

    }
}
