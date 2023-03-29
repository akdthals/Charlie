public class C01_자료형 {
    public static void main(String[] args) {
        // 자료형 => 데이터 타입(Data Type)
        // int => 정수형
        // string => 문자형
        // 100% 타입설정
        // 자바 기본타입 : int, long, float, double, char, string, boolean, byte, short
        // 변수 _cnt $cnt 특수문자 2개 사용


        
        // -. 정수 자료형
        // 예] 타입설정 변수임름 =  (대입 연산잔)  0(변수 값)
        // 예] 타입설정 cnt = 0
        // 타입의 정의는 변수에 들어오는 (대입하는) 변수 값의 타입을 설정한것.
        // 예] int cnt = 123;  // cnt 변수에 정수형 값을 대입한다.
        // 예] long cnt2 = 45645468451;  // cnt 변수에 정수형 값을 대입한다.
        



        // -. 실수 자료형
        // 예] float num = 34.3333;  // num 변수에 실수형(소숫점이하에 숫자가 포함된것) 값을 대입한다.
        // 예] double num2 = 34.33335654545454;  // num 변수에 실수형(소숫점이하에 숫자가 포함된것) 값을 대입한다.
         



        // -. 문자 자료형
        // '' 싱글(홀) 쿼트 (따옴표)  사용
        // 예] char grade = 'A';
        
        

        
        // -. 문자열 자료형
        // "" 더블(겹) 쿼트 (따옴표) 사용
        // 예] string str = 'I love you!';
        
        

        
        // -. 논리형 자료형
        // 참(true)/거짓(false) 데이터를 저장하는 자료형
        // 예] boolean isGender1 = false;
        // 예] boolean isGender2 = true;

        
        
        // 1. 정수 자료형
        int numInt = 30;
        long numLong = 300000000;
        System.out.println("int형 " +  numInt);
        System.out.println("long형 " +  numLong);


        // 2. 실수 자료형
        double numDouble = 1.414213;
        float numFloat = 1.41F;  // 플롯형은 더블형보다 작은 실수 표현
                                 // 반드시 숫자 맨 뒤 f를 붙여서 표기한다.
        System.out.println("float " + numFloat);
        System.out.println("double " + numDouble);



        // 3. 문자 자료형
        char a = 'A'; 
        char b = '대';
        char c = 65;  // ASCIT CODE 값: A = 65, B = 66, C = 67,  ....
        char d = 97;  // ASCIT CODE 값: a = 97 ....
        char e = 98;  // ASCIT CODE 값: b = 98 ....

        System.out.println("char a "+ a);
        System.out.println("char b "+ b);
        System.out.println("char c "+ c);
        System.out.println("char d "+ d);
        System.out.println("char e "+ e);





        
        
    }
}
