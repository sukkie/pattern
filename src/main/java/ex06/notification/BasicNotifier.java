package ex06.notification;

// 래퍼가 없는 데코레이터
public class BasicNotifier implements Notifier {
    // 이친구는 뭔가를 의존하면 안됨
    @Override
    public void send() {
        System.out.println("기본알림");
    }
}
