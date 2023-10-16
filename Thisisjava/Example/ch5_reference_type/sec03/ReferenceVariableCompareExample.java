package ch5_reference_type.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        // 배열 변수 선언
        int[] arr1;
        int[] arr2;
        int[] arr3;

        // new 연산자로 {1,2,3} 배열 객체를 생성하고 (힙 영역에 메모리 차지)
        // 각각 arr1과 arr2에 대입.
        // arr1과 arr2의 데이터 값은 같지만, 참조하는 객체의 주소가 다르다.
        arr1 = new int[] {1,2,3};
        arr2 = new int[] {1,2,3};
        arr3 = arr2;

        // 참조 타입 변수 비교 연산
        System.out.println(arr1 == arr2); //false
        System.out.println(arr2 == arr3); //true
    }
}
