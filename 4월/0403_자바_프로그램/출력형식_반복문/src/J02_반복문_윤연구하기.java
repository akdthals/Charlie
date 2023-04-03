import java.util.Scanner;

public class J02_반복문_윤연구하기 {
    public static void main(String[] args) {
        int year = 2000;


        for(int i = 1900; year<=2900; year++){

        
            if( (year % 4==0 && year%100!=0) || year%400==0 ){
                System.out.println(year + "년도는 윤년입니다");
              

            }

        }


    }
}
