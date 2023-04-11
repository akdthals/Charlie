/**
 * J01_1차원배열_2차원배열_배열병합
 */
public class J01_1차원배열_2차원배열_배열병합 {

    public static void main(String[] args) {
        // 1. 1차원 배열 3개 생성
        int[] numbers1={10,50,80,70,90};
        int[] numbers2={10,50,80,70,90};
        int[] numbers3={10,50,80,70,90};

        // 2. 2차원배열 생성하기
        int[][] arr1 = {
            {10,50,80,70,90},
            {10,50,80,70,90},
            {10,50,80,70,90}
        };

        // 3. 배열의 길이(행갯수)
        System.out.println();
        System.out.println("arr1 행갯수 : " + arr1.length);
        System.out.println();

        // 4. 배열의 길이(열갯수)
        System.out.println();
        System.out.println("arr1[0] 열갯수 : " + arr1[0].length);
        System.out.println("arr1[1] 열갯수 : " + arr1[1].length);
        System.out.println("arr1[2] 열갯수 : " + arr1[2].length);
        System.out.println();

        // 5. 2차원배열 출력
        System.out.println();
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        // 6. 1차원배열 2차원뱅열로 병합하기
        int[][] arr2 = {numbers1,numbers2,numbers3};

        System.out.println();
        System.out.println("arr2[0] : " + arr2[0].length);
        System.out.println("arr2[1] : " + arr2[1].length);
        System.out.println("arr2[2] : " + arr2[2].length);
        System.out.println();

        // 6. 2차원 배열 출력
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    
}