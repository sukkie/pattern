package ex05;

import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

/**
 * 템플릿 메소드 패턴.
 * 부모가 가지고 있는 고정적인 기능은 두고,
 * 자식은 고정적이지 않은것을 재정의해서 호출.
 */
public class App {
    public static void main(String[] args) {
//        Teacher t = new Teacher();
//        t.수업시작();

        Teacher jt = new JavaTeacher();
        jt.수업시작();

        Teacher pt = new PythonTeacher();
        pt.수업시작();
    }
}
