import java.util.Scanner;



public class J04_반복문_시작_종료값_연산 {
    public static void main(String[] args) {

        // 입/출력 설계
        // 코딩
        // 결과 확인
        // 처리(Proccese)



        // 시작 정수 입력
        // 종료 정수 입력
        // 0. 변수 선언
        int s=0;
        int e=0;
        int sum=0; // 누적 변수는 반드시 초기값이 있어야 한다.

        Scanner sc = new Scanner (System.in);

        // 1. input 
        System.out.println("시작 정수 입력: ");
        s = sc.nextInt();
        System.out.println("종료 정수는? ");        
        e = sc.nextInt(); 

        




        // 문제 1] 시작부터 종료까지 누적 합 구하기
        // 3. PROCESS
        for(int i = s; i<=e;  i++){
            // sum = sum +i;
            sum+=i; // sum = sum + i; 알고리즘 표현법
        }



        // 2. OUTPUT
        // System.out.printf("시작값: %d, 종료값: %d, 누적값: %d ", s,e, sum);
        System.out.println("시작 ~ 종료 합/////////////////////////////////");
        System.out.println(String.format("시작값: %d, 종료값: %d, 누적값: %d ", s,e, sum));
        



        // 문제 2] 시작부터 종료까지 4의배수 합 구하기
        // 3 ~ 100
        sum=0; // 누적변수는 반드시 초기화
        for(int i = s; i<=e;  i++){
           if(i%4==0){
            sum+=i; // sum = sum +i; 알고리즘 표현법 // 4 + 8 = 12
           }

            

            
        }

        // 2. OUTPUT
        // System.out.printf("시작값: %d, 종료값: %d, 누적값: %d ", s,e, sum);
        System.out.println("4의 배수 누적 합 /////////////////////////////////");
        System.out.println(String.format("시작값: %d, 종료값: %d, 누적값: %d ", s,e, sum));
    }
}
