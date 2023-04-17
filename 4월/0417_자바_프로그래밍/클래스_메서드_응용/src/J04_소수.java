import java.util.Scanner;

public class J04_소수 {

    // 리턴값 있는 메서드 prime
    public static boolean Prime(int num){
           boolean bool =true;
           if(num==1){
            bool = false;
           }
           for(int i=2; i<num; i++){
                if(num % i ==0){
                    bool = false;
                }
           }
           return bool;
        }
    
    

    public static void main(String[] args) {
        
        // 소수를 구현하시오.
        // 1 보다 큰 자연수
        // 1과 자신만을 약수로 가지는 수
        // 메서드 리턴값 있는 메서드
        // 리턴값은 boolean 으로 하시오
        // true or false 사용 소수 출력 아니면 출력 안함.
        

        // 화면 입력값 정수의 소수를 구하시오.
        // 예시]
        // 정수 30입력
        // 2 3 5 7 11 13 17 19 23 29 
        Scanner sc = new Scanner (System.in);


        System.out.println("정수 입력 : ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            if( Prime (i) == true ){ // 소수이면 true 반환(리턴값)
                System.out.println( i + " ");
            }
        }

        
    }

}
