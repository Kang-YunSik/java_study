package study1.inheritant;

public class Animal {

    // 필드 선언
    private String name;
    private String species;

    // 매개변수가 있는 부모 생성자 선언
    public Animal(String name, String species) {
        // 인스턴스 할당 : 매개변수를 this.변수에 할당
        // 다른 클래스에서 생성자를 선언하면 초기화 된다.
        this.name = name;
        this.species = species;
    }

    // getter를 활용해 다른 클래스에서 Animal 클래스의 필드를 읽을 수 있도록 함.
    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }

    // 메소드 선언
    public void makeSound(){
        System.out.println("애완동물 이름: " + name);
        System.out.println("애완동물 종: " + species);
    }

    // 메소드 선언2 (부모 클래스에만 있음)
    public void makeSound2(){
        System.out.println("사람 이름: " + name);
        System.out.println("사람 종: " + species);
    }
}

