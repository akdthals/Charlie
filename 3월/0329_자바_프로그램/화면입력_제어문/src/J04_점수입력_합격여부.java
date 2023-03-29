
import java.util.Scanner;

public class J04_점수입력_합격여부 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        // 준제1] 성적 처리 평균점수 

        // 1. 화면 입력
        // 국어점수
        // 영어점수
        // 수학점수
        // 3과목 점수(정수) 입력 받아서

        // 2. 연산처리
        // 총점 연산, 평균을 연산

        // 3. 조건문 구현 출력
        // 조건문
        // 평균이 80점이상이면 합격 그렇지 않으면 불합격
        // 알고리즘 구현하시오
        System.out.println("국어 : " + 'k');
        int k = sc.nextInt();
        System.out.println("영어 : " + 'e');
        int e = sc.nextInt();
        System.out.println("수학 : " + 'm');
        int m = sc.nextInt();

        System.out.println();
        int tot = k+e+m;

        double avg = (float)tot / 3;
        System.out.println("총점 :" + tot);

        System.out.println("평균 : " + avg);
        
        if(tot > 80 ){
            System.out.println("평균 점수가 80점이상이라서 합격입니다.");
        }
        else{
            System.out.println("80점 미만이라서 불합격 입니다. 공부를 더 열심히 하고 오세요");
        }


        

    }
}
