package ex01;

/**
 * 전략패턴.
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();
        dm.쫒아내(m);
        dm.쫒아내(c);
    }
}
