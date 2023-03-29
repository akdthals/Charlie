
import java.util.Scanner;

public class J01_화면입력_혼자하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("문자열을 입력하세요");
        String str = sc.nextLine();
        System.out.println("입력된 문자는 = " + str);

        System.out.println("단어를 입력 : ? " );
        String word = sc.next();
        System.out.println("입력 단어는 = " + word);

        System.out.println("정수 입력 : ");
        int num = sc.nextInt();
        System.out.println("입력 된 정수는: " + num );

        System.out.println("실수 입력 : ");
        Double num2 = sc.nextDouble();
        System.out.println("입력된 실수는 : " + num2);

        System.out.println("문자를 입력하세요");
        char ch = sc.next().charAt(0);
        System.out.println("입력된 글자는 (첫번째) = " + ch);

        sc.close();
    }
}
