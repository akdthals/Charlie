/**
 * J01_입력화면_조건문_IF_SWITCH
 * 제한 조건문
 * 범위 조건에는 조금 부족하다. 그래서 if
 * 입력값을 받아서 
 * 선택된 메뉴에 따라 조건이 결정
 */

     
    import java.text.DecimalFormat;
import java.util.Scanner;



public class J01_입력화면_조건문_SWITCH {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);



        // 0. 변수 선언 및 타입 지정, 초기값 설정 
        int menu = 1; 
        int soo = 1; // 
        int price = 8000;
        int pan = price * soo; // 초기값
        String menuStr = "떡볶이";




        // 주문시 수량 입력 안하면 기본은 1이다.
        // 아래의 지시사항 대로 구현 하시오.
        


        // INPUT(입력)
        // 1-1. 입력하면 설계 - 메뉴선택 : 1. 떡볶이 2. 순대 3. 튀김
        // 1-2. 입력하면 설계 - 수량입력 : 1
        System.out.println("손님 메뉴 선택하세요");
        menu = sc.nextInt();

        System.out.println("손님 몇개 주문할까요? 수량을 입력하세요");
        soo = sc.nextInt();

        

        // PROCESS(처리)
        // 2-1. 가격조견표
        // 1. 떡볶이 : 8000원
        // 2. 순대 : 7000원
        // 3. 튀김 : 6000원
        
        


        // 2-2. 조건문 스위치 케이스 IF(){} ELSE IF(){} else{}
        // 2-3. 정가 * 수량 = 판매가

        switch(menu){
            case 1: // 메뉴가
                    // 1인경우 (뭐뭐인 ~ 경우)
            // case '떡볶이';
                price = 8000;
                pan = price * soo;
                menuStr = "떡볶이";
                break;

            case 2:
                price = 7000;
                pan = price * soo;
                menuStr = "순대";
                break;

            case 3:
                price = 6000;
                pan = price * soo;
                menuStr = "튀김";
                break;
            
            default:
            price = 0;
            pan = price * soo;
            menuStr = "주문한 메뉴는 없습니다";
        }
        // if(menu==1 || menu=='떡볶이'){
        //     price = 8000;
        //     pan = price * soo;
        //     menuStr = "떡볶이";

        // }
        // else if(menu==2 || menu=='순대'){
        //     price = 7000;
        //     pan = price * soo;
        //     menuStr = "순대";

        // }
        // else if(menu==3 || menu=='튀김'){
        //     price = 6000;
        //     pan = price * soo;
        //     menuStr = "튀김";

        // }
        // else{
        //     price = 0;
        //     pan = price * soo;
        //     menuStr = "주문한 메뉴는 없습니다";

        // }
        


        // OUTPUT(출력)
        // 3-1. 출력 설계 : ~를 선택 했습니다. 잠시만 기다리세요
        // 3-2. 출력표시형식 : 메뉴, 수량, 정가, 판매, 가격 
        // 세자리 마다 콤마 형식: 데시멀 포맷형식
        // 외부 클래스를 가져오면 반드시 생성자를 생성하여 사용한다.
        // DecimalFormat 은 숫자를 스트링 형태의 표시 형식으로 변환 => 반드시 출력은 STRING 자료형
        DecimalFormat df = new DecimalFormat("#,###"); // "#,###"  "#,##0" 인용부호는 반드시 스트링이니깐 더블 쿼트를 써라

        System.out.println();
        System.out.printf("선택한 메뉴는 [%d번] [%s]를, [%d]개 주문했습니다\n", menu, menuStr, soo);
        System.out.printf("결제 금액은 [%d] 입니다\n", pan);
        System.out.printf("결제 금액은 [%s] 입니다", df.format(pan));
        System.out.println();
        System.out.println();
    }
    
}
