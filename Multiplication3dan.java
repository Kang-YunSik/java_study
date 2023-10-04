//3단을 모두 출력하는 코드
//println으로 출력하여 형식 문자열을 사용하지 못해 자릿수가 맞지 않는 경우

package multiplicationTable;

public class Multiplication3dan {
    public static void main(String[] args) {

        int dan = 3;

        for(int i=1; i<9; i++){
            int res = dan * i;
            System.out.println(dan+" x "+i+" = "+res); //printf와 형식 문자열을 잘 조합하면 출력값의 자릿수를 맞출 수 있음
        }
    }
}
