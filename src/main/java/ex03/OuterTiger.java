package ex03;

// 레거시 또는 외부에서 만들 코드(수정불가)
// 수정하면 OCP 원칙 위반
public class OuterTiger {
    private String fullname = "호랑이";

    public String getFullname() {
        return fullname;
    }

}
