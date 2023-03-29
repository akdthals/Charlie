/**
 * J01_원의면적구하기
 */
public class J01_원의면적구하기 {

    public static void main(String[] args) {
        final double PI = 3.14159; // 원주율 변수를 상수로 선언
        double circleArea;
        double radius = 15.0;

        // 원의 면적 = 반지름 * 반지름 * 원주율
        circleArea  = radius * radius * PI; // 원의 면적 계산
        System.out.println("원의 면적은 = " + circleArea);

        

    }
}