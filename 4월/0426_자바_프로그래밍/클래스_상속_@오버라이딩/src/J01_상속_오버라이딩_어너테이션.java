/* 
 * J01_상속_@오버라이딩_어너테이션
 *  #오버라이딩(Overriding)
 *  @어너테이션 : 메서드 바로 윗줄에 어너테이션 표기 @ 사인(기호)사용
 * 부모클래스에서 상속 받은 같은 이름의 메서드를 변경(재정의) 하는 것.
 * 메서드 덮어쓰기(오버라이트 Overwrite 수정상태)
 * 
 * - 부모클래스의 메서드와 이름, 매개변수, 리턴타입이 같아야 한다.
 * - 부모클래스의 메서드보다 접근 제어자가의 범위가 좁아질 수 없다.
 * 
 * # 오버로딩과 & 오버라이딩
 * - 오버로딩(Overloading) : 이름은 같고 매개변수가 다른 새로운 메셔드를 정의한다.
 * - 오버라이딩(Overriding) : "상속받은" 같은 이름의 메서드를 변경 (재정의)한다.
 */

public class J01_상속_오버라이딩_어너테이션 {
    public static void main(String[] args) {
        
        // 부모 클래스 Musicion객체
        Musicion mus = new Musicion();
        mus.showJob();
        mus.work();
        System.out.println("==========================================================================");


        // 자식 클래스 Pianist객체
        Pianist pia = new Pianist();
        pia.showJob(); // 오버라이딩한 메서드 호출
        pia.showJob("바이올린"); 


        // => showJob_super()  =>부모클래스의 덮어쓰기된 super.메서드 호출  
        // super.showJob() 
        pia.showJob_super();
        pia.work();
        System.out.println("============================================================================");

        // 자식 클래스 Singer 객체
        Singer sing = new Singer();
        sing.showJob();
        sing.work();
        sing.showJob("몽환의 숲");
        
    }
   
}

// 부모 클래스
class Musicion{
    public void showJob(){
        System.out.println();
        System.out.println("mus.showJob() => 부모클래스 위치 직업은 뮤지션입니다.");
        System.out.println();
    }
    void work(){ // 기본(default) 접근 제한자
        System.out.println();
        System.out.println("mus.work() => 부모 클래스 위치 무대에서 공연합니다.");
        System.out.println();
    }
}


// 자식 클래스
class Pianist extends Musicion{
    public void showJob(){
        System.out.println();
        System.out.println("pia.showJob() 오버라이딩한 매서든 호출 => 자식클래스 위치 저의 직업은 피아니스트입니다.");
        System.out.println();
    }
    void showJob(String gok){
        System.out.println();
        System.out.println("pia.showJob('바이올린') 오버로딩 =>자식클래스 위치 저는 " + gok + "을 연주하는 피아니스트입니다");
        System.out.println();
    }
    // 부모클래스의 같은 이름의 메서드 호출 실행
    public void showJob_super(){
        super.showJob(); // 덮어쓰기된 부모 메서드 사용
    }

    // 부모 클래스의 메서드 중 work() 메서드를 
    // 오버라이딩 메서드를 재정의 하시오
    // 같은 패키지 내에서 사용하도록 재정의 하시오.

    //private void work(){}
    // 에러발생 : 오버라이딩할 메서드의 접근 제한자 범위는 좁아질 수 없다.

    public void work(){
        System.out.println();
        System.out.println("자식 클래스 위치 => 5월 가정의 날 무대에 올라가 피아노를 연주합니다");
        System.out.println();
    }


}

class Singer extends Musicion{

    // 상속 받은 맴버중 메서드가 같은 이름을 만들어서 실행
    @Override
    public void showJob(){
        super.showJob(); // 부모 클래스의 메서드를 호출하여 그대로 실행한다.
    }
    // 오버로딩 : 위에 있는 showJob()와 다른 매개변수를 가지는 새로운 메서드를 정리해서 사용한다.
    public void showJob(String song){
       System.out.println("저는 " + song + " 노래를 부릅니다");
       System.out.println();
    }
    // 부모클래스의 있는 메서드이다
    // 그러므로 부모클래스(상위 메서드)와 같은 이름 같은 매개변수 이다. 그래서 오버라이딩이라 한다.
    @Override
    void work(){
        super.work(); // 부모클래스의 (상위메서드) 메서드 실행하고 그리고 아래 내용도 추가로 실행
        System.out.println("어쩌고 저쩌고 ... 오버라이딩한 메서드 내용 호출 실행해 보았습니다.");
        System.out.println();
    }
}