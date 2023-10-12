//3단을 모두 출력하는 코드
//printf와 형식 문자열을 조합하여 출력값의 자릿수를 맞춘 경우

package multiplicationTable;

public class Multiplication3danSort {
    public static void main(String[] args) {

        int dan = 3;

        for(int i=1; i<9; i++){
            int res = dan * i;
            // printf 출력 메소드는 형식 문자열을 사용할 수 있다.
            // %d와 %2d는 각각 정수, 2자리 정수를 출력하며, %2d와 같이 적절한 숫자를 조합하여 자릿수를 맞출 수 있다.
            // %d(정수) 외에도 %f(실수), %s(문자열)을 출력할 수 있으며, \n으로 줄바꿈을 할 수 있다.
            System.out.printf("%2d x%2d = %2d\n",dan, i, res);
//            System.out.printf("%d x%d = %d\n",dan, i, res);
        }
    }
}
