import java.util.Scanner;

/**
 * J01_선택_사칙연산_메서드
 */
public class J01_선택_사칙연산_메서드 {
    static int addMethod(int a, int b){
        return a + b;
    }
    static int subMethod(int a, int b){
        return a - b;
    }
    static int mulMethod(int a, int b){
        return a * b;
    }
    static double divMethod(int a, int b){
        return (double)a / b;
    }

    
    

    public static void main(String[] args) {
        // 프로젝트 : 4칙연산 메서드 구현 => 1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈
        // 입력화면에서 : 1을 선택하면 덧셈 메서드로 이동 연산결과를 리턴값으로 받는다.
        // 선택 조건문은 switch(){}
        // 메서드 이름은 
        // 1. 덧셈   : addMethod
        // 2. 뺄셈   : subMethod
        // 3. 곱셈   : mulMethod
        // 4. 나눗셈 : divMethod
        // 모든 메서드 리터값이 있는 메서드로 제작한다.
        // 연산 매개변수는 2개로 한다.num1, num2
        // 연산 결과는 println(); 출력

        // [예시]
        // 입력설계  

        // 정수1 입력 : 5
        // 정수2 입력 : 10

        // 연산 종류를 선택하세요
        // 1. 덧셈
        // 2. 뺄셈
        // 3. 곱셈
        // 4. 나눗셈

        // 연산 리턴 
        // 출력 에시
        // 정수1, 정수2, 연산결과 = 15

        Scanner sc = new Scanner(System.in);
        System.out.println("1번덧셈 ,2번뺄셈, 3번곱셈, 4번나눗셈");
        
        int num= sc.nextInt();

        System.out.println("정수1 입력 : ");
        int num1 = sc.nextInt();
        System.out.println("정수2 입력 : ");
        int num2 = sc.nextInt();



        switch (num) {
            case 1:
                System.out.printf("%d + %d = %d",num1,num2, addMethod(num1, num2));
                break;
            case 2:
               
                System.out.printf("%d - %d = %d",num1,num2, subMethod(num1, num2));
                break;
            case 3:
              
                System.out.printf("%d * %d = %d",num1,num2, mulMethod(num1, num2));
                
                break;
            case 4:
            System.out.printf("%d ÷ %d = %.2f",num1,num2,divMethod(num1,num2));
                break;
            default: 
                System.out.printf("잘못된 입력입니다.");
                return; 
        }
    }
}