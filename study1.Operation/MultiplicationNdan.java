//구구단 N단을 출력하는 프로그램

package multiplicationTable;

import java.util.Scanner;

public class MultiplicationNdan {
    public static void main(String[] args) {

        System.out.println("몇 단을 출력하시겠습니까? : ");

        // Scanner 클래스를 활용하여 사용자로 부터 입력값을 받음
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 받은 값을 nDan 변수에 저장하고,
        // nDan값을 Integer클래스의 parseInt함수를 사용하여 int값으로 변경시킨 뒤, dan 변수에 저장
        String nDan = sc.nextLine();
        int dan = (Integer.parseInt(nDan));

        System.out.println(" "+dan+"단 입니다.");

        int res = 0;

        for (int i=1; i<=9; i++){
            res = dan * i;
            System.out.printf("%2d x%2d = %2d\n",dan, i, res);
        }
    }
}
