/* 
    ㅅ
 * # 클래스 한페이지 내에 생성
 * super
 * : 별5개
 * : 자식클래스가 부모클래스의 생성자를 호출할 때 사용하는 이름일 슈퍼 super() 이다.
 * : 자식클래스를 만들면 자동으로 부모클래스의 생성자도 호출되어 사용된다.
 * # 자식클래스에서 부모생성자 호출하기
 * 자식클래스(매개변수....){
 *      super() 매개변수 없는거 요거는 기본생성자  고로 안써도 된다.
 *      왜 기본생성자는 기본으로 실행되니까
 * 
 *      super(매개값1...)
 *      super(매개값1,매개값2.)
 * }
 * ※ super는 매개변수 값의 개수와 타입이 일치하는 부모 생성자를 호출한다.
 * # 클래스는 다중상속을 지원하지 않는다. 
 * # 다중상속은 차후에 공부하는 인테페이스에서 사용가능하다.(다중상속)
 */

 public class J02_Super {
    public static void main(String[] args) {

        Actor newActor = new Actor();
        // 기본생성자 객체생성
        
        // System.out.println();
        // System.out.println("==================================================");
        // System.out.println();

        Actor newActor2 = new Actor("아바타");
        newActor2.showData();
        // System.out.println();
        // System.out.println("==========================");


        Actor newActor3 = new Actor("장클로드반담", 45, "액션");
        newActor3.showData();
        // System.out.println("=====================================================");



    }
}

// 사람을 주제로 설정하고 상속하고 super() 호출한다.
class Human {
    String name;
    int age;

    Human(){
        System.out.println("부모클래스 위치의 일반 사람 입니다.");
    }

    public Human(String name){
        this.name = name;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
}
class Actor extends Human {
    private String movie;

    public Actor(){
        super(); //  =>  Human()  표기안해도 있는걸로 간주된다. 있으나 없으나 기본생성자는 호출된다.
        // 슈퍼는 자식클래스가 부모클래스의 생성자를 호출할 때 사용하는 키워드 입니다.
        // 부모생성자()  supuer()  이게 기본생성 호출 안써도 호출된다.
        // 부모생성자(매개변수1)   supuer(매개변수1)
        // 부모생성자(매개변수1, 매개변수2)   supuer(매개변수1, 매개변수2)
        // 부모생성자(매개변수1, 매개변수2, 매개변수3)   supuer(매개변수1, 매개변수2, 매개변수3)
        // 부모생성자(매개변수1, 매개변수2, 매개변수3 ....)
        // 부모클래스의 매개변수가 없는 기본생성자를 호출
        // 첫줄에서만 사용 가능하다.
        // supuer()는 부의 기본 생성자를 호출하는 코드입니다.
        // supuer()는 생략되어도 자동적으로 포함하고 있다.
        System.out.println("나는 영화배우 입니다.");
    }

    public Actor(String movie){
        this.movie = movie;
    }
    
    public Actor(String name, int age){
        super(name); // 부모생성자(매개변수사용) 호출 super()
        // 슈퍼(매개변수1개)  =>  public Human(String name)  애가 호출된다.
    }

    public Actor(String name, int age, String movie){
        super(name, age); // 부모생성자(매개변수사용) 호출 super()
        this.movie = movie;
    }

    public void showData(){
        System.out.println("부모클래스 멤버변수 2개 자식클래스 멤버변수 1개 출력");
        System.out.println("부모클래스 사람 이름 : " + this.name );
        System.out.println("부모클래스 사람 나이 : " + this.age );
        System.out.println("자식클래스 영화배우 내용 : " + this.movie );
    }

}