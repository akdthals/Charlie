/**
 * J01_빌딩_호텔_상속
 * 문제]
 * 주어진 빌딩 클래스를 상속하여 
 * 다음 클래스들을 구현하고 객체를 실행해보자
 * 필드값은 메서드로 초기화 하고, 
 * 자식 클래스의 setData() 메서드는 
 * 부모클래스의 메서드를 오버로딩하여 구현해보자
 * 
 * 1. 부모클래스 : Building
 *      - 필드 : 이름, 가격, 
 * 
 * 2. 자식 클래스 : Hotel
 *      - 필드 : 이름, 가격, VIP룸 수
 * 
 * 3. 자식 클래스 : Apart
 *      - 필드 : 이름, 가격, 층수 
 * 
 *  예] 
 *  
 *  이름: 신라호텔
 *  가격: 10
 *  VIP룸수: 20
 * 
 *  이름: 자이아파트
 *  가격: 20
 *  층수: 40
 * 
 */
public class J01_빌딩_호텔_상속 {

    public static void main(String[] args) {
        System.out.println();
        Building bil = new Building();
        System.out.println();
        bil.setData("성민 빌딩",100);
        bil.showData();
        System.out.println();

        System.out.println("=================================");
        System.out.println();
        Hotel ho = new Hotel();
        ho.setData("신라호텔",10, 56);
        ho.showData();
        System.out.println();

        System.out.println("==================================");
        System.out.println();
        Apart ap = new Apart();
        ap.setData("성민 아파트", 100, 97);
        ap.showData();
        System.out.println();

    }
}
// 슈퍼 클래스 (부모클래스)
class Building{
    String name;
    int price;
    public void setData(String name, int price){
        this.name = name;
        this.price = price;
    } 
    public void showData(){
        System.out.print("이름 : " + name + ", 가격 : " + price + "만원");
    }
}

class Hotel extends Building{
    int vip_room;
    // 메서드1 : 오버라이딩
    public void setData(String name, int price, int vip_room){
        super.setData(name, price);
        this.vip_room = vip_room;
    }
    // 메서드2 : 출력
    public void showData(){
        super.showData();
        System.out.print(", VIP 룸 수 : " + vip_room + "개");
    }
}

class Apart extends Building{
    int floor;
    public void setData(String name, int price, int floor){
        super.setData(name, price);
        this.floor = floor;
    }
    public void showData(){
        super.showData();
        System.out.print(", 아파트 층수 : " + floor + "층" );
    }
}