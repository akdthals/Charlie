

import java.util.Scanner;

public class J05_입력화면_조건문_할인율 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        // 문제]

        // 정가(임의의 정수)를 1개만 입력 받아서 
        // 할인율을 정하라
        // 그리고 판매가를 구하시오
        
        // 조견표
        // 정가 500,000 이상 할인율 20% => 0.2
        // 정가 100,000 이상 할인율 10% => 0.1
        // 정가 50,000 이상 할인율 5% => 0.05
        // 정가 10,000 이상 할인율 1% => 0.01
        // 정가에 할인율을 적용해서 판매가를 구현하시오.

        // 할인율 
        double rate = 0.0;




        // 1. input 설계
        System.out.println("정가(가격)을 입력하시오");
        long price = sc.nextLong();



        // 2. process 처리
        // 할인율 조건문
        if(price >= 500000){
            rate = 0.2;
        }
        else if(price >= 100000){
            rate = 0.1;
        }
        else if(price >= 50000){
            rate = 0.05;
        }
        else if(price >= 10000){
            rate = 0.01;
        }
        else{
            rate = 0.0;
        }
        



        // 3. output 설계
        System.out.println();
        System.out.printf("정가(가격)는 [ %d ] 입니다.", price);
        System.out.printf("할인율은 [ %f ] 입니다.", rate);
        System.out.printf("판매가는 [ %f ] 입니다.", (long)price*(1-rate));
       

        
    }
}
