package ex06.notification;

public class EmailNotifier implements Notifier {

    private Notifier notifier;

    public EmailNotifier() {

    }

    public EmailNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        // 널이어도 실행될 수 있도록
        if (notifier != null) {
            notifier.send();
        }
        System.out.println("이메일 알림");
    }
}
