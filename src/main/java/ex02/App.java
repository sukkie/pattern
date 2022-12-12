package ex02;

/**
 * 프록시 패턴.
 */
public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorManProxy dm = new DoorManProxy(new DoorMan());
        dm.쫒아내(m);
        dm.쫒아내(c);
    }
}
