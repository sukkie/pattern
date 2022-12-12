package ex04;

/**
 * 문지기를 딱 하나만 만들고 싶음.
 */
public class DoorMan {

    // 메인메소드를 호출하기전에 JVM이 읽어서 메모리에 올라옴.
    private static DoorMan doorMan = new DoorMan();

    public static DoorMan getInstance() {
        return doorMan;
    }

    private DoorMan() {

    }

    public void 쫒아내(Animal a) {
        System.out.println(a.getName() + " 쫓아내");
    }
}
