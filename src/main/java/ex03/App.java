package ex03;

/**
 * 어댑터
 * 외부 요소를 기존 시스템에 재사용하고 싶지만 아직 만들어 지지 않은 경우
 * 외부 요소를 기존 시스템에 재사용하고 싶지만 호환되지 않는 경우
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();
        TigerAdapter ta = new TigerAdapter(new OuterTiger());

        dm.쫒아내(m);
        dm.쫒아내(c);
        dm.쫒아내(ta);
    }
}
