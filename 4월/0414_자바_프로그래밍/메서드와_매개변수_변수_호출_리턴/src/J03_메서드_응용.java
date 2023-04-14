public class J03_메서드_응용 {


    // 1. 리턴 X, 매개변수 X 메서드
    // 예제] "안녕하세요" 문자열을 5번 출력하는 메서드를 만들고 실행하시오.
    static void hello(){
        for(int i=0;i<5;i++){
            System.out.println(( i + 1 ) + " 안녕하세요");
        }
    }

    // 2. 리턴x, 매개변수 2개인 메소드
    // 매개 값 문자열과 숫자를 입력 받고 
    // 받은 숫자의 횟수만큼 문자열 내용응 반복 출력하는 메서드를 작성하고 실행하시오.
    // 메서드 이름 repeatStr 매개변수는 문자열 str, 숫자는 num 사용
    static void repeatStr(String str, int num){
        for(int i=0; i<num;i++){
            System.out.println( str );
        }
    }

    // 3. 리턴 o, 매개변수 o 메서드
    // 문제] 
    // 세개의 숫자를 입력 받고, 평균 값을 리턴 하는 메서드를 작성하고 실행하시오.
    // 메서드 이름 average 매개변수는 숫자 a, b, b사용
    static double average(int a, int b, int c){
        return (a+b+c)/3.0;
    }
    // 4. 리턴 x, 매개변수 o 메서드 (int[] arr)
    // 문제] 매개변수가 1차원 배열 
    // 매개변수 받아서 배열을 반복문 사용 출력 하는 매서드 작성하고 실행 하시오.
    // 메서드 이름 arrMethod1 매개변수는 배열은 정수형 1차원 배열 변수사용 arr 
    static void arrMethod1 (int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.printf("%3d ", arr[i]);
        }
        System.out.println();
    }
    // 5. 리턴 x, 매개변수 o 메서드
    // 문제] 매개변수가 2차원 배열 
    // 매개변수 받아서 배열을 반복문 사용 출력 하는 매서드 작성하고 실행 하시오.
    // 메서드 이름 arrMethod2 매개변수는 배열은 정수형 2차원 배열 변수사용 arr 
    static void arrMethod2(int[][] arr2){
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length;j++){
                System.out.printf("%3d ", arr2[i][j]);
            }
            System.out.println();
        }
    }
    // 6. 리턴 x, 매개변수 o 메서드
    // 문제] 매개변수가 2차원 배열 
    // 매개변수 받아서 배열을 반복문 사용 출력 하는 매서드 작성하고 실행 하시오.
    // 메서드 이름 arrMethod2 매개변수는 배열은 정수형 2차원 배열 변수사용 arr 
    static int arrMethod3(int[][] arr3){
        int sum=0;
        for(int i=0; i<arr3.length; i++){
            for(int j=0; j<arr3[i].length;j++){
                sum+=arr3[i][j];
            }
            System.out.println();
        }
        return sum;
    }
    


    public static void main(String[] args) {
        // 1. 리턴 X, 매개변수 X 메서드 => 메서드 호출
        System.out.println();
        hello();
        System.out.println();

        // 2. 리턴x, 매개변수 2개인 메소드(문자열, 숫자)
        System.out.println();
        repeatStr("오늘은 금요일", 10);
        System.out.println();

        // 3. 리턴 o, 매개변수 o 메서드 
        System.out.println();
        double avg = average (80,95,95);
        System.out.println("평균 " + (avg));
        System.out.println();

        // 4. 1차원배열 
        // 배열 선언과 생성하여 전달
        // 매서드 호출 전달 실행
        int[] arr ={10,50,70,65,80};
        arrMethod1(arr);


        // 5. 2차원배열
        // 배열 선언과 생성하여 전달
        // 매서드 호출 전달 실행
        int[][] arr2 ={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,46,85},
            {11,81,81,825,45},
            {58,78,48,18,54}
        };
        arrMethod2(arr2);


        System.out.println();
        int sum = arrMethod3(arr2);
        System.out.println("2차원배열 합 = " + sum);
        System.out.println();



        
    }
}

