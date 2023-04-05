/**
 * J01_화폐단위구하기
 */
import java.util.Scanner;
public class J01_화폐단위구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // 금액 187000
        // 50000원권
        // 10000원권
        // 5000원권
        // 1000원권
        // 문제] 위 금액을 각 지폐 단위로 매수를 구한다.

        // 1. 입력설계 [input]
        int price = 187000;
        int oman =0;
        int ilman =0;
        int ochun = 0;
        int ilchun =0;

        
        

        // 3. 처리 설계
        oman   = price / 50000; // 5만원권
        ilman  = (price-(oman * 50000))/10000; // 187000-(3*50000))/10000 1만원권
        ochun  = (price-(oman * 50000)-(ilman * 10000))/5000; // (price-(oman * 50000)-(ilman * 10000))/5000; 5천원권
        ilchun = (price-(oman * 50000)-(ilman * 10000)-(ochun * 5000))/1000; //(price-(oman * 50000)-(ilman * 10000)-(ochun * 5000))/1000; 1천원권




        // 2. 출력설계 [output]
        System.out.println("금액 " + price + "원");
        System.out.println("_________________________");
        System.out.println("5만원권 "+ oman + "장");
        System.out.println("만원권 " + ilman + "장" );
        System.out.println("오천원권 "+ ochun + "장");
        System.out.println("천원권 "+ ilchun + "장");
        
    }
}