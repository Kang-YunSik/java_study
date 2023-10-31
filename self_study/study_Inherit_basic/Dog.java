package study1.inheritant;

public class Dog extends Animal {

    // 필드 선언 : 새로운 매개변수 정의
    public int age; // 새로운 매개변수의 타입 확인!

    // 매개변수가 있는 자식1 생성자 선언
    public Dog(String name, String species, int age) {
        super(name, species); // 부모 생성자 호출 : 부모 클래스에서 만든 생성자를 자식 클래스가 사용
                            // 부모 생성자의 매개변수가 필요함으로 반드시 작성해야함.
        this.age = age;
    }

    // getter
    public int getAge() {
        return age;
    }

    // 메소드 재정의(오버라이딩)
    // 현재 클래스의 생성자로 부터 받은 인스턴스 변수 사용
    @Override
    public void makeSound() {
        System.out.println(getSpecies() + "종인 " + age+"살의 " + "우리집 강아지 " + getName() + "은 멍멍하고 울어요");
    }
}
