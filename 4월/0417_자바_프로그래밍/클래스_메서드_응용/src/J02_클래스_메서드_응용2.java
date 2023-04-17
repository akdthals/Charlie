import java.util.Scanner;

public class J02_클래스_메서드_응용2 {


    public void methodfn(int num){
        System.out.println();
        for(int i=0; i<num; i++){ // 출력 설계
            System.out.println("5월은 가정의 달입니다. 5월29일 대체휴일 좋아요");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        J02_클래스_메서드_응용2 newJ02 = new J02_클래스_메서드_응용2 ();
        int num =0;
        Scanner sc = new Scanner(System.in);
        

        System.out.println("반복할 횟수는: ");
        num =sc.nextInt();



        // 호출 실행
        newJ02.methodfn(num);
        
    }
}
