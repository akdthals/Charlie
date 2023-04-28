/*
 * 부모클래스: Phone 
 * 필드: 이름, 통신사, 가격 
 * 
 * 자식클래스1: Phone1 
 * 필드: 서비스시간
 * 
 * 자식클래스2: Phone2
 * 필드: 서비스시간
 * 
 */
public class J02_휴대폰_상속 {
    public static void main(String[] args) {
        Phone num1 = new Phone();
        System.out.println();
        num1.setData("아이폰", "KT", 150);
        num1.showData();
        System.out.println();

        System.out.println("==========================");
        System.out.println();
        Phone1 num2 = new Phone1();
        num2.setData("갤럭시", "SKT", 160, 800);
        num2.showData();
        System.out.println();

        System.out.println("==========================");
        System.out.println();
        Phone2 num3 = new Phone2();
        num3.setData("모토라", "LG", 170, 100);
        num3.showData();
        System.out.println();
    }
}
class Phone{
    String name;
    String telecom;
    int price;
    public void setData(String name, String telecom, int price){
        this.name =name;
        this.telecom = telecom;
        this.price = price;
    }
    public void showData(){
        System.out.println("이름:" + name + ", 통신사:" + telecom + ", 가격: " + price + "만원");
    }
}
class Phone1 extends Phone{
    int service;
    public void setData(String name, String telecom, int price, int service){
        super.setData(name, telecom, price);
        this.service = service;
    }
    public void showData(){
        super.showData();
        System.out.println("통화시간: " + service);
    }
}

class Phone2 extends Phone{
    int service;
    public void setData(String name, String telecom, int price, int service){
        super.setData(name, telecom, price);
        this.service = service;
    }
    public void showData(){
        super.showData();
        System.out.println("통화시간: " + service);
    }
}
