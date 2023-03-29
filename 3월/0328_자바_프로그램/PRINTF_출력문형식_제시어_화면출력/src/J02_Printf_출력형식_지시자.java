/*
 * printf 지시자
 * %d 10진수 정수(Decimal)형식으로 출력
 * %f 실수(Floating-point)형식(부동소수점형식)으로 출력
 * %s 문자열(String)로 출력
 * %x 16진수(Hexa-Decimal)형식으로 출력
 * %o 16진수(Octal-Decimal)형식으로 출력
 * %b 논리형(true/false) 부울린(Boolean)형식으로 출력 
 * %c 문자로(Charcter)형식으로 출력
 * %e 지수형식으로 출력
 * 
*/


public class J02_Printf_출력형식_지시자 {
    public static void main(String[] args) {
        // 정수형 변수에 대입 2진수 리터럴 입력
        // 정수형 변수에 8진수를 대입
        // 정수형 변수에 16진수를 대입
        // 256 128 64  32 16 8 4 2 1
        //     1    1   1  1 1 0 1 0
        // 128 64 32 16 8 2 => 250
        int num_b = 0b11111010;
        int num_o = 0372;
        int num_x = 0xfa;

        System.out.println("// Printf 출력형식 지시자 사용 % 8자리 우측정렬 자료형 지시자 ________________");
        System.out.printf("%8s(2)   %d(10)\n", "11111010", num_b);
        System.out.printf("%8o(8)   %d(10)\n",  0372,      num_o);
        System.out.printf("%8x(16)  %d(10)\n",  0xfa,      num_x);

        System.out.println("// Printf 출력형식 지시자 사용 % -8자리 좌측정렬 자료형 지시자 ________________");
        System.out.printf("%-8s(2)   %d(10)\n", "11111010", num_b);
        System.out.printf("%-8o(8)   %d(10)\n",  0372,      num_o);
        System.out.printf("%-8x(16)  %d(10)\n",  0xfa,      num_x);


        // 10진수를 2진수, 8진수, 16진수로 출력하는 형식
        int num_d = 250;
       
        String binaryString = Integer.toBinaryString(num_d); // 2진수 문자열로 변환 
        String octalString = Integer.toOctalString(num_d); // 8진수 문자열로 변환
        String hexaString = Integer.toHexString(num_d); // 16진수 문자열로 변환

        // printf() 출력형식 구현하시오.
        System.out.println("// Printf 출력형식 지시자 사용 % 8자리 우측정렬 자료형 지시자 ________________");
        System.out.printf("%8s(2)  %d(10)\n", binaryString, num_d);
        System.out.print("=====================");

        System.out.printf("\n%8s(8)  %d(10)\n", octalString, num_d);
        System.out.print("======================");

        System.out.printf("\n%8s(16) %d(10)\n", hexaString,  num_d);
        System.out.print("======================");
        System.out.println();

        // 문제]
        int x1 = 255;
        float x2 = 33.456f;
        float x3 = 3.14f;
        double x4 = 1.233123912;
        String x5 = "I love You!";

        // 위 변수값을 형식에 알맞게 출력하시오.
        // 자릿수는 자유롭게 자료형에 맞는 형식지정 출력
        // 정렬은 우측정렬 출력형식
        // %8.4 => 소숫점자리이하 4자리 소숫점포함 5자리(소숫점영역) 
        // 나머지 3자리 소숫점 앞 (정수 부분영역) 
        System.out.printf("x1 = %3d\n", x1);
        System.out.printf("x2 = %8.4f\n", x2);
        System.out.printf("x3 = %8.4f\n", x3);
        System.out.printf("x4 = %8.4f\n", x4);
        System.out.printf("x5 = %s\n", x5);



    }
}
