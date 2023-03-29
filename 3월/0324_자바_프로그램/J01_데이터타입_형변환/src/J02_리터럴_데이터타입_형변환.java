public class J02_리터럴_데이터타입_형변환 {
    public static void main(String[] args) {
        // 숫자 리터럴
        long pariceNum = 12_345_678_934_567L;
        // long pariceNum = 12_345_678_934_567L; 끝에 사용 불가
        // float floatNum = 3_.12159F;  소숫점 앞 뒤 에는 사용불가
        // float floatNum = 3._12159F;  소숫점 앞 뒤 에는 사용불가
        long longNum = 0x76;
        // long longNum = 0_x76; x 앞 뒤 사용 불가
        // long longNum = 0x_76; x 앞 뒤 사용 불가
        long longNum2 = 0b01010; 
        // long longNum2 = 0_b01010; x 앞 뒤 사용 불가
        // long longNum2 = 0b_01010; x 앞 뒤 사용 불가
        int intNum4 = 045; // 8진수
        int intNum5 = 5_546_876; // 8진수
        // int intNum6 = 045_;


        System.out.println("// 숫자리터럴 _언더바(언더스코어) 사용: 가독성을 높여준다 __________");
        System.out.println("12_345_678_934_567L" + pariceNum );
    }
}
