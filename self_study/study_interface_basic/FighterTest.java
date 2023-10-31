// 추상 클래스 정의
abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다");
    }
}

// 인터페이스 정의
interface Fightable {
    // 인터페이스는 추상 메소드만 갖을 수 있다.
    // 추상 메소드는 public abstract void 값을 갖는다.
    void move(int x, int y); // public abstract가 생략됨
    public abstract void attack(Fightable f); // public abstract가 생략됨
}

// 클래스 정의
class Fighter extends Unit implements Fightable {
    // 인터페이스 추상 메소드 재정의 (public 필수)
    // 오버라이딩 규칙: 조상(public)보다 접근제어자가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" + x + "," + y + "]로 이동" );
    };
    public void attack(Fightable f) {
        System.out.println(f+"를 공격");
    };

    // Fightable 타입을 반환받아야 한다.
    Fightable getFightable() {
        Fighter nf = new Fighter(); // Fighter를 생성
        return nf; // Fighter를 반환
    }
}

public class FighterTest {
    public static void main(String[] args) {
        // 인터페이스 객체 생성
        // 다형성
        Fightable f = new Fighter();
        Fightable f2 = new Fighter();

        f.move(100, 200);
        f.attack(new Fighter());
//        f.stop(); // Fightable에는 stop()메소드가 없어서 호출 불가

        // 추상클래스 객체 생성
        Unit u = new Fighter();
        u.move(100, 200);
//        f.attack(new Unit()); // Unit에는 attack()메소드가 없어서 호출 불가

        // 클래스 객체 생성
        Fighter f3 = new Fighter();
        f3.move(100, 200);
        f3.stop();
        f3.attack(new Fighter());

        f3.getFightable();
    }
}
