public class J02_메서드_리턴여부_메서드 {
    public static void main(String[] args) {
        System.out.println();
        method1();
        method2("이순신");
        method3(3, 5);
        System.out.println( "리턴값이 있는 메서드 호출 결과 = " + method4(5, 8));

        int result = method4(5, 8);
        System.out.println( "리턴값이 있는 매개변수2 메서드 변수에 호출 그리고 결과 = " + result);


        result = method5(3,5,7);
        System.out.println( "리턴값이 있는 매개변수3 메서드 변수에 호출 그리고 결과 = " + result);

        result = method5(100,2,3);
        System.out.println( "리턴값이 있는 오버로딩 결과 " + result);


        result = method5(9,2,3);
        System.out.println( "리턴값이 있는 오버로딩 결과 " + result);

        result = method5(10,1,33);
        System.out.println( "리턴값이 있는 오버로딩 결과 " + result);

        result = method5(10,1,33);
        System.out.println( "리턴값이 있는 오버로딩 결과 " + result);
        
        result = method5(10,1,33);
        System.out.println( "리턴값이 있는 오버로딩 결과 " + result);

        // 리턴값이 문자열
        String resultStr = method5("오버로딩 ", " 매개변수2개");
        System.out.println( "리턴값이 있는 문자열 " + resultStr);







        System.out.println();
    
    }
    // 1. 기본 메서드 : 리턴값이 없는 메서드 void 
    //               : 매개변수 없는 메서드 ()
    public static void method1() {
        System.out.println("여기는 기본 메서드 입니다 ");
    }

      // 2. void 메서드 : 리턴값이 없는 메서드 void 
    //               : 매개변수 있는 메서드 (매개변수)
    public static void method2(String name){
        System.out.println("리턴 값이 없는 메서드, 매개변수 있는 메서드 입니다." + name) ;
    }
    // 3.  void 메서드 : 리턴값이 없는 메서드 void 
    //                : 매개변수 없는 메서드 (매개변수1, 매개변수2)
    public static void method3(int a, int b){
        System.out.println(" a + b = " + ( a + b ) );
    }

    // 4. 정수형 리턴값이 있는 메서드 
    //                : 매개변수 없는 메서드 (매개변수1, 매개변수2)
    public static int method4(int a, int b){
        return a+b;
    }
    // 5. 정수형 리턴값이 있는 메서드 
    //                : 매개변수 없는 메서드 (매개변수1, 매개변수2, 매개변수3)
    public static int method5(int x, int y, int z){
        return x * y + z;
    }

    // 오버로딩 (overloading)
    // 6. 리턴갑 자료형같고 메서드 이름 같은 매서드(매개변수 자료형이 다르다)
    //    매개변수 자료형이 다르면 같은 이름의 매서드 사용 가능하다.
    //                 정수형 리턴값이 있는 메서드 
    //                : 매개변수 없는 메서드 (매개변수1, 매개변수2, 매개변수3)
    public static int method5(int x, int y, long z){
        return x * y + (int)z;
    }
    public static long method5(int x, long y, int z){
        return x - y - z;
    }
    public static long method5(long x, int y, int z){
        return x + y + z;
    }
    public static long method5(long x, long y, int z){
        return x / y - z;
    }
    public static long method5(long x, long y, long z){
        return x * y * z;
    }
    public static String method5(String x, String y){
        return x + ", " + y;
    }

}
