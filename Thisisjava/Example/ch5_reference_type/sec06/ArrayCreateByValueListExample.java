package ch5_reference_type.sec06;

public class ArrayCreateByValueListExample {
    public static void main(String[] args) {
        // 배열 변수만 선언
        int[] scores;
        // 배연 변수에 값 대입
        // 배열 변수 선언 시점과 다르기 때문에 new 연산자 사용
        scores = new int[]{83,90,87};

        // for문으로 배열 항목의 총합을 구하고 출력
        int sum1 = 0;
        for (int i=0; i< scores.length; i++){
            sum1 += scores[i];
        }
        System.out.println("총합: "+sum1);


        // 메소드 매개변수가 배열 일 때, 호출 방법

        // printItem는 매개변수로 배열이 필요하고, 메소드를 정의할 때 매개변수를 선언하였다.
        // 따라서 new 연산자로 printItem의 매개변수를 선언한다.
        printItem(new int[] {83,90,87});
    }
    // printItem 메소드 선언
    public static void printItem(int[] scores){
        for (int i=0; i< scores.length; i++){
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}
