package ch5_reference_type.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        // 리터럴로 String 객체 선언
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        // 리터럴로 String 객체를 선언하면 동일한 객체를 공유하도록 설계되어 있다.
        if (strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음"); //출력
        }else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }
        // equals 함수 : 문자열 비교 (주소는 비교 안함)
        if (strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음"); //출력
        }


        // new 연산자로 String 객체 선언
        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        // new 연산자로 String 객체를 선언하면, 서로 다른 객체를 참조한다.
        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        }else {
            System.out.println("strVar3과 strVar4는 참조가 다름"); //출력
        }
        // equals 함수 : 문자열 비교 (주소는 비교 안함)
        if (strVar3.equals(strVar4)){
            System.out.println("strVar1과 strVar2는 문자열이 같음"); //출력
        }
    }
}
