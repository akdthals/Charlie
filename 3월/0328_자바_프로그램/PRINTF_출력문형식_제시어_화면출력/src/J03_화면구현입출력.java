
// 스캐너 클래스 가져와서 사용하기
// 클래스 사용시 반드시 생성자를 생성하고 사용한다. 

import java.util.Scanner;  // 유틸 패키지(폴더) 들어 있는 Scanner 클래스를 가져와서 사용한다.

public class J03_화면구현입출력 {
    public static void main(String[] args) {

        // 생성자 생성 : 화면 입력 
        Scanner newScanner = new Scanner(System.in);

        // 1. 문자열을 입력해 주세요 (한 줄) 엔터 라인단위
        System.out.println("문자열을 입력하세요");

        // 2. 화면 입력 : newScanner.nextLine(); 문자열 입력을 하는 코딩
        String str = newScanner.nextLine(); // 화면에서 입력 받은 문자열 => str 변수에 대입 된다.
        
        // 3. 입력 받은 str 변수 문자열 출력
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("str = %s \n" , str);
        System.out.println();


        // 문자열 입력 받기(한 단어) : 동백 전까지 입력 받는다
        //  newScanner.next(); 문자열 입력을 단어 단위로 입력 받는다
        System.out.println("문자열 단어를 입력 하세요");
        String word =  newScanner.next();
        System.out.printf(" word = %s \n", word);
        System.out.println();

        
    }
}
