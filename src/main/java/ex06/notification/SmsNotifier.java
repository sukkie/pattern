package ex06.notification;

public class SmsNotifier implements Notifier {

    private Notifier notifier;

    public SmsNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        // 널이어도 실행될 수 있도록
        if (notifier != null) {
            notifier.send();
        }
        System.out.println("SMS 알림");
    }
}
