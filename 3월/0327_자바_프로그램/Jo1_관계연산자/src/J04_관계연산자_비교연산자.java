public class J04_관계연산자_비교연산자 {
    public static void main(String[] args) {
        // 관계연산자(비교안산자)
        // > 크다
        // >= 크거나 같다(이상)
        // < 작다
        // <= 작거나 같다(이하)
        // ==같다
        // != 같지 않다 (부정, 서로 다르다)
        // boolean 부울란 ( 부울 )은 true(1) or false(0) 논리 값을 나타낸다.
        

        int n = 10;
        boolean b1 = false ;

        b1 = n > 5; // 변수 n은 보다 크다.
        System.out.println("b1 = n > 5 " + b1); // 10은 5보다 크다 참이다.
        // Result => b1 = n > 5 : true

        // 문제1]
        // n 정수형 변수에 8을 대입
        // a 정수형 변수에 20을 대입
        // b2 는 boolean으로 자료형 선언 변수 
        // n은 a보다 작거나 같다 조건식
        // 구현하고 출력하시오
        // 비교 연산 구현하시오
        n = 8;
        int a = 20;
        boolean b2;

        b2 = n <= a;
        System.out.println("1. n <= a 결과 :  " + b2);
        System.out.println("2. n <= a 결과 :  " + (n <= a));

        // b3 결과 
        // m 변수에 15
        // n 변수 = 14
        // 비교연산 => 같지는 않다
        // b4 비교연산자 => 같지 않다
        boolean b3;
        boolean b4;


        int m = 15;
        n = 14;


        b3 = n == m;
        b4 = n != m;
        System.out.println(" m =  " + m);
        System.out.println(" m = +  " + m);
        System.out.println(" n =  " + n);
        System.out.println(" m =  " + (n==m));
        System.out.println(" b3 = n == m :  " + (n != m));
        System.out.println(" b4 = n != m :  "  + (n!=m));


        //문제2]
        //변수 정수형x = 90
        //변수 정수형y = 70
        //변수 불링형p1 크다
        //변수 불링형p2  작다
        //변수 불링형p3  크거나 같다
        //변수 불링형p4  작거나 같다
        //변수 불링형p5  같다
        //변수 불링형p6  같이 않다

        // 구현 x, y, p1, p2, p3, p4, p5 , p6 출력


        int x = 90;
        int y = 70;
        
        boolean p1, p2, p3, p4, p5, p6;
       
        p1 = x > y;
        p2 = x < y;
        p3 = x >= y;
        p4 = x <= y;
        p5 = x == y;
        p6 = x != y;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        

        

        




    }
}
