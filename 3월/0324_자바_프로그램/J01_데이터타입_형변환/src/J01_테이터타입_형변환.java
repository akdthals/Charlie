public class J01_테이터타입_형변환 {
    public static void main(String[] args) {
       
        
        // 문자 & 정수
        System.out.println("// 문자 & 정수 _____________"); 
        System.out.println( 65 );
        System.out.println( (char)65 ); // ASCII 아스키코드 65 A  Upper Case
        System.out.println( 'a' );
        System.out.println( (int)'a' ); // ASCII 아스키코드 97 a Lower Case
        System.out.println( 'z' );
        System.out.println( (int)'z' ); // ASCII 아스키코드 122 a
        System.out.println( 'A' );
        System.out.println( (int)'A' ); // ASCII 아스키코드 65 A  Upper Case
        System.out.println( 'Z' );
        System.out.println( (int)'Z' ); // ASCII 아스키코드 90 z Upper Case


        // 정수 & 실수
        System.out.println("// 정수 & 실수 _____________"); 
        System.out.println( 255 ); 
        System.out.println("(float)255 " + (float)255 ); 
        System.out.println("(double)255 "+ (double)255 ); 
        
        System.out.println( 3.14159f ); 
        System.out.println("(int)3.14159f " + (int)3.14159f ); 
        System.out.println("(int)3.14159d " + (int)3.9994159d ); 

                
        // 정수(Int, Long) & 실수(Double, Float) & 리터럴  접두사, 접미사
        System.out.println(""); 
        System.out.println("// 정수(Int, Long) & 실수(Double, Float) _____________"); 
        
        System.out.println("// 실수(Double) _____________"); 
        double num_double_D = 354.12345678901234567890D; // 맨뒤에 접미사 D 
        double num_double_d = 354.12345678901234567890d; // 맨뒤에 접미사 d
        double num_double   = 354.12345678901234567890;  // 맨뒤에 접미사 생략(더블형) *float는 생략 불가

        System.out.println("num_double_D " + num_double_D );
        System.out.println("num_double_d " + num_double_d );
        System.out.println("num_double "   + num_double );

        System.out.println("");
        System.out.println("// 실수(Double) => 정수(int) 형변환_______");

        int num_int1  = (int)num_double_D;
        int num_int2  = (int)num_double_d;
        long num_long  = (long)num_double;

        System.out.println("num_int1 "   + num_int1 );
        System.out.println("num_int2 "   + num_int2 );
        System.out.println("num_long "   + num_long );


        System.out.println("// 실수(Float) => 실수(Double) _____________"); 
        float num_float_F = 354.12345678901234567890F; // 맨뒤에 접미사 F 
        float num_float_f = 354.12345678901234567890f; // 맨뒤에 접미사 f 

        double num_double_D_float_F = (double)num_float_F;
        double num_double_d_float_f = (double)num_float_f;

        System.out.println("num_double_D_float_F " + num_double_D_float_F );
        System.out.println("num_double_d_float_f " + num_double_d_float_f );



        System.out.println("");
        System.out.println("// 수동형변환 (명시적 형변환) : 문자 => 숫자 _______");


        // 1. 문자 => 숫자
        String strNum = "1";  // 스트링은 첫글자 대문자로 선언한다. 리터럴값은 더블쿼트를 사용한다.

        // System.out.println( strNum * 5 );  //게산불가
        // String to int
        int intNum = Integer.parseInt(strNum);

        // System.out.println( intNum * 5 );  //게산가능

        System.out.println("// String to Integer _______");
        System.out.println("String strNum = " + strNum);
        System.out.println("Integer.parseInt(strNum) => intNum = " + intNum);

        // String to Double
        double doubleNum = Double.valueOf(strNum);
        System.out.println("// String to Double _______");
        System.out.println("String strNum = " + strNum);
        System.out.println("Double.valueOf(strNum) => doubleNum = " + doubleNum);

        // String to Float
        float floatNum = Float.valueOf(strNum);
        System.out.println("// String to Float _______");
        System.out.println("String strNum = " + strNum);
        System.out.println("Float.valueOf(strNum) => floatNum = " + floatNum);

        // String to Long
        long lognNum = Long.parseLong(strNum);
        System.out.println("// String to Long _______");
        System.out.println("String strNum = " + strNum);
        System.out.println("Long.parseLong(strNum) => lognNum = " + lognNum);

        // String to Short
        short shortNum = Short.parseShort(strNum);
        System.out.println("// String to Short _______");
        System.out.println("String strNum = " + strNum);
        System.out.println("Short.parseShort(strNum) => shortNum = " + shortNum);



        System.out.println("");
        System.out.println("// 수동형변환 (명시적 형변환)  :  숫자 => 문자 _______");

        // 2. 숫자 => 문자
        int intNum2 = 10;
        // String strNum2 = '';  싱글쿼트는 String 에서 리터럴 값이 오류
        String strNum2 = ""; 
        strNum2 = String.valueOf(intNum2);

        System.out.println("int intNum2 = " + intNum2);
        System.out.println("String.valueOf(intNum2) => strNum2 = " + strNum2);


        strNum2 = Integer.toString(intNum2);
        System.out.println("int intNum2 = " + intNum2);
        System.out.println("Integer.toString(intNum2) => strNum2 = " + strNum2);

        // 3. 정수 <=> 실수
        double doubleNum2 = 1.12345;
        int intNumResult;

        // Double to Int
        intNumResult =(int)doubleNum2;

        System.out.println("doubleNum2 = " + doubleNum2);
        System.out.println("(int)doubleNum2 => intNumResult = " + intNumResult);


        float floatNum2 = 1.12345f;
        // Float to Int
        intNumResult =(int)floatNum2;

        System.out.println("floatNum2 = " + floatNum2);
        System.out.println("(int)floatNum2 => intNumResult = " + intNumResult);



        //////////////////////////////////////////////////////////////////////////
        


    }
}
