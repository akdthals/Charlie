import java.util.Scanner;

public class J02_화폐단위구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int price = 187000;
        int oman = 0;
        int ilman = 0;
        int ochun = 0;
        int ilchun = 0;

        // System.out.println("금액을 입려갛세여ㅛ");
        // price = sc.nextInt();

        oman = price / 50000;
        ilman = (price -( oman* 50000)) / 10000;
        ochun = (price- (oman* 50000)-(ilman *10000))/5000; 
        ilchun = (price - (oman*50000)-(ilman*10000)-(ochun*5000))/1000;

        System.out.println("금액" + price + "원");
        System.out.println("___________________");
        System.out.println("5만원권" + oman + "장");
        System.out.println("1만원권" + ilman + "장");
        System.out.println("오찬원권" + ochun + "장");
        System.out.println("천원권" + ilchun + "장");


    }
}
