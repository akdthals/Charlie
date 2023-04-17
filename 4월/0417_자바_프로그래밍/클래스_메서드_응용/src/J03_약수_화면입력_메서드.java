import java.util.Scanner;

public class J03_약수_화면입력_메서드 {

    // 단 리턴문 없는 메서드를 호출 실행한다.
    public static void a(int num1){
        for(int i=1; i<=num1; i++){
            if(num1 % i == 0){
                System.out.print( i + " " );
            }
           
        }
    }

    
    public static void main(String[] args) {
        // 정수를 화면 입력 받아서
        // 약수를 구하시오
        // 단 리턴문 없는 메서드를 호출 실행한다.
        // 예시] 
        // 10의 약수
        // 1 2 5 10

        // 8의 약수
        // 1 2 4 8
        // .....
        int num =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력 받으세요 : ");
        num= sc.nextInt();

        // 메서드 호출
        a(num);

    }
}
