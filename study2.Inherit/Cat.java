package study1.inheritant;

public class Cat extends Animal{

    // 필드 선언 : 새로운 매개변수 정의
    public String color;

    // 매개변수가 있는 자식2 생성자 선언
    public Cat(String name, String species, String color) {
        super(name, species);
        this.color = color;
    }

    //getter
    public String getColor() {
        return color;
    }

    // 메소드 재정의(오버라이딩)
    // 현재 클래스의 생성자로 부터 받은 인스턴스 변수 사용
    @Override
    public void makeSound() {
        System.out.println(getSpecies() + "종인 " + color+"의 " + "우리집 고양이 " + getSpecies() + "은 야옹하고 울어요");
    }
}
