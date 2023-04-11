import java.util.Scanner;

public class J04_2차원배열_무한반복문_입력조건_행열 {
    public static void main(String[] args) {
        // 1. 2차원 배열 선언하기
        // 2. 행수(1~10), 열수(1~10) 입력(화면) 받아서 2차원 배열 생성하기
        // 3. 행수와 열수 제한조건 맞으면 다음으로 넘어 가서 실행한다.
        //  아니면 계속 행수 입력 요구, 열수 입력 요구


        // 알고리즘 : 무한반복문(while(true){}) , 
        // 행수 조건문 if( 줄수<1 || 줄수>10)
        // 열수 조건문 if( 줄수<1 || 줄수>10)
        // 모두 만족하면 배열 생성한다.
        // 그리고 배열에 난수 * 26 * 65 영문 대문자 입력
        // 그리고 배열 출력 문자(char)로 출력 완료

        // 1. 입력설계
        int[][] arr;
        int row = 0;
        int col = 0;
        
        Scanner sc = new Scanner (System.in);

        while(true){ // 행 입력만
            System.out.print("행 크기 : ");            
            row = sc.nextInt();
            if(row<1 || row>10){
                System.out.println("행 크기는 1~10까지 정수 입력!");
            }
            else{
                // 열 입력조건
                while(true){
                    System.out.print("열 크기 입력:");
                    col = sc.nextInt();
                    if(col<1 || col>10){
                        System.out.println("열 크기는 1~10까지 정수 입력!");
                    }
                    else{
                        // 행, 열 모두 정상 입력 그리고 배열 생성한다.
                        arr = new int[row][col];
                        // 이제 처리하고 출력하자 문자입력 난수 입력 저장
                        for(int i=0; i<arr.length; i++){
                            for(int j=0; j<arr[i].length; j++){
                               arr[i][j] = (int)(Math.random()*26+65);
                            }
                            System.out.println(); // 줄바꿈
                        }

                        System.out.println();

                        // 출력
                        System.out.println();
                        for(int i=0; i<arr.length; i++){
                            for(int j=0; j<arr[i].length; j++){
                                System.out.printf("%3c", (char)arr[i][j]);
                            }
                            System.out.println(); // 줄바꿈
                        }
                        System.out.println();



                        break; // 열 입력 조건 만족시 소멸 
                    }
                    
                }
                break; // 행입력 종료 소멸 이제 칸입력 조건으로 넘어간다.

            }
        }



        // 2. 출력결과
        // 행 크기 : 10
        // 열 크기 입력:10

        // P  X  J  P  S  F  K  Q  E  P
        // E  E  F  O  Q  E  U  Z  V  Q
        // I  A  E  M  U  V  E  Y  Q  V
        // U  Z  I  L  W  U  N  W  K  V
        // N  C  U  P  M  W  C  W  A  A
        // J  V  T  O  W  K  Q  I  N  F
        // O  N  I  D  O  Y  R  T  W  I
        // Z  A  N  W  F  N  Y  A  T  J
        // N  E  G  P  Q  J  T  G  N  Z
        // E  Z  V  X  S  S  H  P  V  E


    }
}
