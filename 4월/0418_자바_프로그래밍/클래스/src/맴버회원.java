public class 맴버회원 {

    // 1. 맴버회원 클래스(객체 object)를 제작하고
    // 맴버 변수(필드)를 선언하고 맴버 함수(메서드)를 제작한다.

    // 맴버 변수(필드 field)
    String 이름;
    int 나이;
    double 시력;
    String 취미;
    String 주소;

    // 맴버 함수(메서드 method)
    void show_method(){
        System.out.println();
        System.out.println("==============맴버회원 클래스=============");
        System.out.println();
        System.out.println("이름: " + 이름);
        System.out.println("나이: " + 나이);
        System.out.println("시력: " + 시력);
        System.out.println("취미: " + 취미);
        System.out.println("주소: " + 주소);
        System.out.println();
    }

}
