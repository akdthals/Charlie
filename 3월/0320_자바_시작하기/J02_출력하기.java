public class J02_출력하기 {
    public static void main(String[] args) {
        
        // 문자열 연산
        System.out.println("자바 출력문 입니다. 라이피드 줄바꿈");
        
        // 
        System.out.println("자바" + "JDK 프로그램"); // 문자열 + 문자열(연결연산자)
        
        // 정수출력
        System.out.println(30);  // 정수출력
        
        // 실수 출력
        System.out.println(255.5); // 실수 출력
        
        // 사직연산
        System.out.println(150 + 130); // 숫자 더하기 연산
        System.out.println(15.98 + 35.33); // 실수 더하기 연산
        System.out.println("250 + 130 = " + (250 + 130) );
        System.out.println("250 * 130 = " + (250 * 130) );
        System.out.println("250 / 130 = " + (250 / 130) );


        // 줄 바꿈 없는 출력 프린트 출력 Escape new Line 사용
        System.out.print("문자열 안에 \n" );
        System.out.print("줄바꿈 넣기 \n" );
        System.out.print("새로운 줄  \n 에서 줄바꿈" );

        // printf %d 사용 숫자 출력 = c언어 형식 출력
        System.out.printf("\n정수 : %d", 3300);
        System.out.printf("\n정수 : %d", 15600);

        // 시스템 줄바꿈 메서드 사용하기 
        System.out.println("메서드를 이용 줄바꿈하기" +  System.lineSeparator() + "다음줄 내용");
        System.out.println("" + System.lineSeparator() + "");
        System.out.println("" + System.lineSeparator() + "");
        System.out.println("" + System.lineSeparator() + "");
        System.out.println("" + System.lineSeparator() + "");


    }
}
