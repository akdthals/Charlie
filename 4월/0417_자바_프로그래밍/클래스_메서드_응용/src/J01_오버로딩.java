/**
 * J01_오버로딩
 */
public class J01_오버로딩 {


    // 매개변수 없도 static 키워드 없는 메서드
    // => 클래스 생성자 생성 하소 메서드 호출 실행
    public void Overloading(){
        System.out.println("static 없는 메서드 실행");
    }


    // 매개변수 없고 리턴 없는 메서드
    public static void Overloading(String str){
        System.out.println("매개변수 없는 기본 메시드 = " + str);
    }

    ////////////////////////////////////////////////////////////////////////////////

    // 오버로딩1 메서드 선언
    // void 없는 메서드는 리턴 값이 있는 메서드 
    public static String Overloading(String name, String jikcheck){
        return name + " " + jikcheck;
    }
    


    // 오버로딩2 메서드 선언
    public static int Overloading(int a, int b){
        return a+b;
    }


    // 오버로딩3 메서드 선언
    public static String Overloading(String a, int b){
        return a + ", "+ b;
    }


    // 파라미터 갯수와 아듀먼트 갯수가 달라도 되는데 
    // 단 파라미터 갯수가 아규먼트 갯수보다 적으면 오류
    // 오버로딩4 메서드 선언
    public static Double Overloading(double a, int b){
        return a - b;
    }


    // 오버로딩5 메서드 선언
    public static float Overloading(float a, int b){
        return  a + b ;
    }


    public static void main(String[] args) {

        // static 없는 메서드
        // 클래스 생성하고 실행한다.
        J01_오버로딩 newJ01_오버로딩 = new J01_오버로딩();
        

        String overload1 = Overloading("이순신", "전라좌수영"); // 아규먼트(전달인자)
        int overload2 = Overloading(10, 30);
        String overload3 = Overloading("김유신", 50); // 스트링 => 스트링 + 정수
        Double overload4 = Overloading(70.5, 60); 
        float overload5 = Overloading(10.5f, 3); 

        System.out.println();



        newJ01_오버로딩.Overloading(); // () 리턴값이 없는 메서드 호출 실행
        Overloading("리턴값없는 기본메서드"); // () 리턴값이 없는 메서드 호출 실행

        System.out.println("오버로딩1 결과: " + overload1 );
        System.out.println("오버로딩2 결과: " + overload2 );
        System.out.println("오버로딩3 결과: " + overload3 );
        System.out.println("오버로딩4 결과: " + overload4 );
        System.out.println("오버로딩5 결과: " + overload5 );
        System.out.println();

    }
}