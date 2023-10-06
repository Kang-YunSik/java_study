//구구단 1~9단까지만 출력해주는 프로그램

package multiplicationTable;

import java.util.Scanner;

public class MultiplicationNdanAddInputValueCondition {
    public static void main(String[] args) {

        System.out.println("몇 단을 출력하시겠습니까?");
        // 사용자에게 제약조건을 설명해줌
        System.out.println("(1부터 9까지 입력하세요)");

        // nextInt 함수를 사용해 사용자로 받은 값을 int로 저장
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();


        int res = 0;

        // if~else 연산구조를 활용하여, dan이 1~9까지일 때 : 계산기 기능 수행 / 그 외 : 오류 메세지 출력
        if (dan>0 && dan <= 9) {
            System.out.println(" "+dan+"단 입니다.");

            for (int i=1; i<=9; i++){
                res = dan * i;
                System.out.printf("%2d x%2d = %2d\n",dan, i, res);
            }
        }else {
            // 오류 메세지 출력
            System.out.println("오류: 1부터 9까지만 입력해주세요");
        }
    }
}
