/**
 * J02_리터럴_테이터타입_형변환
 */
public class J02_리터럴_테이터타입_형변환 {

    public static void main(String[] args) {
        // 숫자 리터럴
        long priceNum = 1_234_567_891_234_567_899L;
        // long priceNum = 1_234_567_891_234_567_899_L;  끝에 사용불가        
        System.out.println("// 숫자 리터럴 _ 언더바(언더스코어) 사용 : 가독성을 높여준다. ______________");
        System.out.println("1_234_567_891_234_567_89L " +  priceNum );


        float ploatNum = 3.14____159f;
        // float ploatNum = 3_.14159f;   소숫점 앞 뒤 에는 사용불가
        // float ploatNum = 3._14159f;   소숫점 앞 뒤 에는 사용불가
        System.out.println("");
        System.out.println("ploatNum = 3.14____159f" + ploatNum );


        long longNum = 0x7______6; // 16진수
        // long longNum = 0_x76;  x 앞뒤 사용불가
        // long longNum = 0x_76; x 앞뒤 사용불가
        System.out.println("");
        System.out.println("longNum = 0x7______6" + longNum );



        long longNum2 = 0b1110_0101_0101_0110;  // 2진수
        // long longNum2 = 0_b01010;  x 앞뒤 사용불가
        // long longNum2 = 0b_01010;  x 앞뒤 사용불가
        System.out.println("");
        System.out.println("longNum2 = 0b1110_0101_0101_0110" + longNum2 );




        int ingNum4 = 04______________5;  // 8진수
        System.out.println("");
        System.out.println("ingNum4 =  04______________5" + ingNum4 );



        int ingNum5 = 0_512_____341_234; // 8진수
        // int ingNum6 = 045_; // 사용불가
        System.out.println("");
        System.out.println("ingNum4 =  0_512_____341_234" + ingNum5 );




        // var  




    }
}