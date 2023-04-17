import java.util.Scanner;

public class J02_클래스_메서드_응용 {


        // 1. 메서드 제작
        public void Month(int a){
            System.out.println();
            for(int i =0; i<a; i++){
                System.out.println("5월은 가정의 달입니다. 5월29일 대체휴일 좋아요");
            }
            System.out.println();
        }

        



    public static void main(String[] args) {
        // 문자열을("5월은 가정의 달입니다. 5월29일 대체휴일 좋아요") 출력할 횟수를 정수로 화면에서 입력
        // 그리고 메서드는 static도 키워드도 없고 
        // 리턴값도 없는 메서드를 생성하고 호출 실행 하시오.
        
        J02_클래스_메서드_응용 newJ02_클래스_메서드_응용= new J02_클래스_메서드_응용();


        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println("반복할 횟수는: ");
       
        
        newJ02_클래스_메서드_응용.Month(a);
        
        

    }
}
