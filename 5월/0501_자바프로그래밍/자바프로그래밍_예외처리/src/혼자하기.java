import java.util.Scanner;

public class 혼자하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("첫번째 정수:");
                int num = sc.nextInt();
                System.out.println("두번째 정수:");
                int num1 = sc.nextInt();
                if(num1==0){
                    Exception e = new Exception("예외처리 => 0 으로 나눌 수 없습니다");
                    throw e;
                }
                System.out.println(num + "/" + num1 + "=" +(num/num1));
                break;
            }
            catch(Exception e){
                System.err.println("오류 메시지 " + e.getMessage());
                e.printStackTrace();
            }
        }
        
    }
}
