import java.util.Scanner;

public class J03_2차원배열_선언_화면입력값_행열_난수_알파벳대문자 {
    public static void main(String[] args) {
        // 2차원 배열 화면입력 행갯수, 열갯수 입력 받는다. 배열 생성
        // 행열 값은 난수*65~91를 이용 영문 대문자를 출력한다.
        // 배열[i][j] =(int)(Math.random()*26+65); // 실수 0~1 사이의 실수 0.1  0.001  0.3  0.98
        // 아스키코드(ASCII CODE) A(65) B(66)  ...Z(91) => 26자*난수 + 65
        // 아스키코드(ASCII CODE) a(97) B(98)  ...Z(123) => 26자*난수 + 97
        // 아스키코드(ASCII CODE) 0(48) 1(49)  ...9(57) => 10자*난수 + 48
        // 영문대문자 배열값 = 난수*26자+65 == > 65~91 A ~ Z 
        // 영문소문자 배열값 = 난수*26자+97 == > 97~123 A ~ Z 
        // 출력 강제 형변환 정수를 문자로 출력 

        Scanner sc = new Scanner(System.in);

        // 1. 입력설계 : 정방형 2차원 배열 사용
        int[][] arr;
        int row=10;
        int col=4;
        System.out.println("행의 갯수를 입혁하세요");
        row = sc.nextInt();
        System.out.println("열의 갯수를 입력하세요");
        col = sc.nextInt();
        arr = new int[row][col];
        


        // 3. 처리설계(구현)
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                arr[i][j]= (int)(Math.random()*26+65); 
            }
            System.out.println();
        }


        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                System.out.print((char)(arr[i][j])+ "  ");
            }
            System.out.println();
        }
    }
}
