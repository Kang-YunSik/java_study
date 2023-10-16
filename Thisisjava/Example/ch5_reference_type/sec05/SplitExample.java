package ch5_reference_type.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        // split() 메소드로 ,를 구분점으로 문자열 분리
        // split() 메소드의 리턴값을 받을 문자열 변수를 하나 선언해주는 것이 좋음.
        String[] token = board.split(",");

        // token 문자열 인덱스 별로 출력
        System.out.println("번호: " + token[0]);
        System.out.println("제목: " + token[1]);
        System.out.println("내용: " + token[2]);
        System.out.println("성명: " + token[3]);

        // for문으로 token 문자열 인덱스 별로 출력
        for (int i=0; i<token.length; i++){
            System.out.println(token[i]);
        }
    }
}
