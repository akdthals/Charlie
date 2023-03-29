
import java.util.Scanner;

public class J03_조건문_화면입력_신호등 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // 신호등 색상을 입력 하여 조건문 구현
        System.out.println("신호등의 색상을 입력 하세요 대소문자 구별 없어요^^ (R, G, Y) ");
        char Sign = sc.next().charAt(0);


        // 주의 소문자(Low Case), 대문자(Upper Case) 구별 없이 입력
        // | 바(Bar) 키보드 원 사인 기호 위에 있는 기호인데 파이프(|) || OR 연산 논리함 ~ 또는 ~ 하거나
        if(Sign == 'R' || Sign == 'r'){
            System.out.println("자동차는 정지 신호 입니다");
        }
        else if(Sign == 'G' || Sign == 'g'){
            System.out.println("자동차는 진행 신호 입니다");
        }
        else if(Sign == 'Y' || Sign == 'y'){
            System.out.println("자동차는 주의 신호 입니다");
        }
        else{
            System.out.println("자동차 신호에 없는 색상 입니다.");
        }
    }
}
