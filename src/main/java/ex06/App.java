package ex06;

import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;
import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/**
 * 데코레이터 패턴(장식).
 * (A) - B(A) - C(B(A))
 */
public class App {
    public static void main(String[] args) {
        // 1. 일반적인 방식
//        Notifier basicNotifier = new BasicNotifier();
//        basicNotifier.send();
//
//        Notifier emailNotifier = new EmailNotifier();
//        emailNotifier.send();

        // 2. 이슈1. 이메일 알림을 하면서 기본알림도 사용하고 싶을때
        // EmailNotifier에 컴포지트로 BasicNotifier를 받음
//        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
//        emailNotifier.send();
//
//        Notifier smsNotifier = new SmsNotifier(new BasicNotifier());
//        smsNotifier.send();

        // 3. 이슈2. 한번에 모든 알림을 보내고 싶을때
        Notifier allNotifier = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        allNotifier.send();

        System.out.println("--------");

        // 호출 순서 변경 가능 - 다양한 조합이 가능
        Notifier allNotifier2 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        allNotifier2.send();

        System.out.println("--------");
        Notifier allNotifier3 = new SmsNotifier(new EmailNotifier(new EmailNotifier()));
        allNotifier3.send();

    }
}

