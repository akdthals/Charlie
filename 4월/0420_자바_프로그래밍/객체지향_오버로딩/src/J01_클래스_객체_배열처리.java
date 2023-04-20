/**
 * J01_클래스_객체_배열처리
 */
public class J01_클래스_객체_배열처리 {

    public static void main(String[] args) {
      // name      |   telecom  |   service
      // 폰기종     |   통신사  |   서비스시간
      // 객체배열[]
      // 매개변수 3개를 생성하고 처리하시오
      // 아이폰           LG         100
      // 갤럭시           KT          80
      // 모토로라         SKT        100
        System.out.println();
        Phone n1 = new Phone();
        n1.showTelecome();
        System.out.println();

        Phone n2 = new Phone("모토로라");
        n2.showTelecome();
        System.out.println();

        Phone n3 = new Phone("갤럭시", "KT");
        n3.showTelecome();
        System.out.println();

        Phone n4 = new Phone("아이폰", "LG", 100);
        n4.showTelecome();
        System.out.println();


        System.out.println("========================배열==========================");
        Phone[] waf1 = new Phone[3];

        waf1[0] =  new Phone("아이폰", "LG", 120 );
        waf1[1] =  new Phone("갤럭시","KT", 120);
        waf1[2] =  new Phone("모토로라", "SKT", 100);
        
        for(int i=0; i<waf1.length; i++){
            System.out.println("폰" + (i+1) + " : ");
            waf1[i].showTelecome();
        }




    }
}
// 문제]
// 클래스(객체) 이름 : Phone
// Phone 클래스 내부 필드 : 
// 클래스(객체) 생성자 배열[3] 반복처리
// 결과를 출력하시오

class Phone{
    String name ;
    String telecom; 
    int service; 

    Phone(){
        this. name ="아이폰";
        this.telecom ="SK";
        this.service =50;
    }
    Phone(String name){
        this.name = name;
    }

    Phone(String name, String telecom){
        this.name= name;
        this.telecom= telecom;
    }

    Phone(String name, String telecom, int service){
        this.name = name;
        this.telecom = telecom;
        this.service = service;
    }

    // 메서드 /////////////////////////////////// => 메서드 호출 => 메인 메서드 
    void showTelecome(){
        System.out.println("폰기종: " + this.name + ", 통신사 : " + this.telecom + ", 서비스시간: " + this.service + "시간");
    }
}
