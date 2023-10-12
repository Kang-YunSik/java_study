package study1.inheritant;

public class AnimalMain {
    public static void main(String[] args) {

        // Dog와 Cat 클래스에 dog, cat 객체 생성
        // 각각의 객체에 매개변수에 값을 할당
        Dog dog = new Dog("초코", "말티즈", 5);
        Cat cat = new Cat("미우", "블루 사파이어", "흰색");

        System.out.println("[추가된 매개변수]");
        System.out.println("강아지 나이: " + dog.getAge());
        System.out.println("고양이 색깔: " + cat.getColor());
        System.out.println();


        // 메소드 호출 : 각 클래스에서 재정의된 메소드 사용
        dog.makeSound();
        cat.makeSound();

        // 타입 변환 : 자식 클래스에서 객체를 생성하고, 해당 객체를 부모 클래스에 할당할 수 있다.
        Dog myDog = new Dog("윤식","사람",26);
        Animal person = myDog;
        person.makeSound(); // 자식 클래스에서 재정의(오버라이딩)된 메소드를 실행
        person.makeSound2(); // 자식 클래스의 매개변수 값으로 부모 클래스에만 있는 메소드를 실행
    }
}
