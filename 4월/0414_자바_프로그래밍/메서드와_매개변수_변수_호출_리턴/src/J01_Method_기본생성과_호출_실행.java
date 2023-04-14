/**
 * J01_Method_기본생성과_호출_실행
 */
public class J01_Method_기본생성과_호출_실행 {

    public static void main(String[] args) { // 모든 클래스에 1개만 존재하는 매인 메서드
        // 메서드(Method)
        // 1. 메서드 선언 => 함수 같은 종류 
    //     리턴타입 메서드 이름(){}
    //         실행문(영역 => 스코프 Scope)
    // }

    // 기타 프로그램에서의 메서드와 함수 
    // 예)
    // 객체내에서의 함수(메서드) 
    // const object =  new object ();
    // object = {
    //     state: {
    //         isLogin: true;
    //     },
    //     mainSlide: function(){

    //     },
    //     scrollEvent(){

    //     },

    // }
    // class Object2{
        // init(){}
    //     state:{ // 맴버 변수 속성 필드
    //         cnt:0 setState setCnt
    
    //     }
    //     mainSlide(){

    //     }
    //     mainSlide2(){

    //     }
        
    // }
    // const newObject2 = new Object2();
    // Object2 newObject2 = new Object2();
    // function mainSlide(){


    // void    음식(떡볶이, 오뎅);{
    //           ....
    //    System.out.println();
    
    // String    음식(떡볶이, 오뎅, 순대); // 리턴값이 있는 메서드
    // Int    음식(오뎅1, 순대);
    // Long    음식(오뎅2, 순대);
    // Float    음식(오뎅2, 순대){
    //     return ....
    // }

    // 접근 제한자 publick
    // publick static 리턴타입 (쟈료형 String, int...,/ void (리턴없음)) 메셔드 이름(){}
    // publick static 리턴타입 (쟈료형 String, int...,/ void (리턴없음)) 메셔드 이름(매개변수){}

        //메서드 호출 실행
        MainSlide("김유신");
        MainSlide("이순신");
        MainSlide("유관순");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
        MainSlide("");
    } // 메인 메서드

    public static void MainSlide(String irum){ // => 메서드 호출 실행 메인 메서드 내에서 메서드 이름 ();
        System.out.println("출력 결과: 메인 슬라이드 메서드 입니다" + irum);
    }
}