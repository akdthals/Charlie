public class 접근지정자 {
    public static void main(String[] args) {

        Sample aClass = new Sample();
        aClass.a = 10; // public 접근지정자
        // 접근지정자: 모든 패키지 & 모든 클래스 접근가능
        
        // aClass.b = 10; // public 접근지정자
        // 접근지정자 : 다른 패키지 & 모든 클래스 클래스 내에서 접근가능(다른 클래스에서는 접근불가)
        
        aClass.c = 10;
        // aClass.c => default
        // 접근지정자 : 같은 패키지 내에서 모든 클래스 내에서 접근 가능
    }

}
class Sample{
    public int a;
    private int b;
    int c;
}