public class 혼자하기 {
    public static void main(String[] args) {
        int[][] arr ={
            {10,50,80,70,80},
            {5,2,8},
            {75,95,84,57,52,85,65,52},
            {75,95,84,57,52,85,65,52}
        };

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr2 = new int[4][];
        arr2[0] = new int[5];
        arr2[1] = new int[3];
        arr2[2] = new int[8];
        arr2[3] = new int[8];

        int cnt=0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr[i].length;j++){
                cnt++;
                arr2[i][j] = cnt;

            }
        }
        System.out.println();

        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.printf("%3d", arr2[i][j]);

            }
            System.out.println();
        }
        System.out.println();
    }
}
