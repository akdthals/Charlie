import javax.xml.transform.Source;

/* 
 * # 상속
 *   기존의 클래스를 재사용해서 새로운 클래스를 만드는것.
 *   부모클래스를 자식클래스가 필드, 메서드..등을 내려받는 것을 상속(Extends)이라한다.
 *   이때 멤버(필드(멤버변수)와 메서드(멤버함수))를 상속받는다.
 *   단, 생성자는 제외한다.
 * 
 *   부모클래스==슈퍼클래스==상위클래스
 *   자식클래스==서브클래스==하위클래스
 * 
 * # 상속의 특징
 *   자식클래스는 부모클래스의 필드(멤버변수)와 메서드(멤버함수)를 물려받기
 *   때문에 중복되는 코드를 작성할 필요가 없다.
 *   클래스의 재활용함으로써 유연성과 다형성을 추구할 수 있다.
 */

public class J01_Extends {
    public static void main(String[] args) {
        IcecreamWaffle iceWaffle = new IcecreamWaffle();
        System.out.println("===============================");
        System.out.println();

        iceWaffle.Waffle();
        iceWaffle.msgShow();

        // 부모클래스에서 상속 받은 메서드 설정하고 출력
        iceWaffle.setData("바닐라 와플", 5000);
        iceWaffle.getDataChild();

        // 부모클래스에서 상속 받은 메서드 설정하고 출력
        iceWaffle.setData("바닐라 와플", 5000, "쵸코");
        iceWaffle.getDataChild();


        System.out.println();
        System.out.println("===============================");

    }
}

// 부모클래스와 자식클래스를 만들어서 상속의 기본 개념을 이해하자
// 부모클래스
class Waffle{
    String name;
    int price;

    void Waffle(){
        System.out.println("부모클래스의 기본 생성자 입니다. ");
    }
    
    void setData(String name, int price){
       this.name = name; 
       this.price = price; 
    }

    // 출력 메서드
    void getData(){
        System.out.println("부모클래스의 와플이름 : " + this.name );
        System.out.println("부모클래스의 와플가격 : " + this.price );
    }

}

// 자식클래스
class IcecreamWaffle extends Waffle {
    String source;

    void msgShow(){
        System.out.println("자식 클래스 입니다.");
    }

    void setData(String name, int price, String source){
        setData(name, price); // 부모클래스의 멤버변수 값 설정 변경 
        this.source = source; // 자식클래스의 소스 멤버변수 값 변경
    }

    void getDataChild(){
        getData();  // 부모클래스 name, price  가져와서 보여준다.
        System.out.println("자식클래스 와플 소스 : " + this.source );
    }


}
