
import java.util.Scanner;


public class J01_입력화면_조건문_홀짝검사 {
    public static void main(String[] args) {

        // 문제 1]
        // 자연수 입력 받아서
        // 짝수(Even)인지 홀수(Odd) 인지 판단 조건문

        Scanner sc = new Scanner (System.in);

        // % mod 나머지    mode 최빈수
        // 입력 : 자연수
        // 조건 : 짝수, 홀수 판단
        // 출력 : 입력된 숫자와 짝수 입니다 || or 홀수 입니다.
        // 1. 입력 메세지와 입력 화면
        System.out.println("자연수를 입력하세요");
        int imsi = sc.nextInt();

        // 조건 : imsi 2로 나누어서 나머지가 0이면 짝수, 아니면 홀수
        if(imsi % 2 == 0 ){
            System.out.printf("입력값 : [%d] 는 \n ", imsi );
            System.out.println("짝수 입니다.");
        }
        else{
            System.out.println("홀수 입니다 : " );
        }




        sc.close();
    }
}
