import java.util.Scanner;

/**
 * 혼자하기2
 */
public class 혼자하기2 {

    public static void main(String[] args) {
        int[][] arr;
        int row=0;
        int col=0;
        Scanner sc = new Scanner (System.in);

        while(row<1 || row>15){
            System.out.println("행의 길이는 1~15 까지 입력: ");
            row = sc.nextInt();
        }
        while(col<1 || col>15){
            System.out.println("열의 길이는 1~15까지 입력: ");
            col =sc.nextInt();
        }
        arr = new int[row][col];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = (int)(Math.random()*26+65);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.printf("%3c", (char)arr[i][j]);
            }
            System.out.println();
        }
    }
}