public class J03_2차원배열_렌덤_숫자 {
    public static void main(String[] args) {
        
    // 임의 숫자(Random Number )를 증가시켜서 정수로 저장
    // Math.random() => 9보다 크고 작은 임의의 실수가 출력
    // arr[i][j]= (int)(Math.random() * 10 + 1);  // 11 19 1 2
    // 5행5열

    // 1. 입력설계
    int[][] arr = new int[5][5];



    // 3. 처리설계 :arr[i][j] = (int)(Math.random() * 10 + 1);
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            arr[i][j] = (int)(Math.random() * 10 + 1); 
        }
        System.out.println();
    }
    System.out.println();



    // 2. 출력 설계 : 숫자 4자리 오른쪽 정렬 (첫칸은 공백없음)
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            System.out.printf("%2d", arr[i][j]);
        }
        System.out.println();

        }
    }
}
