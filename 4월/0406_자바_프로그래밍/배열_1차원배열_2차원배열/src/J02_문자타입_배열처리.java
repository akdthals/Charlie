public class J02_문자타입_배열처리 {
    public static void main(String[] args) {
        // 문제1 1문자(char) 타입 배열 6개 길이의 배열 생성하기
        // 타입(자료형)지정[] 배열 이름 = new 키워드 타입지정[배열 길이지정]; 
        char[] ch = new char[6]; 
        ch[0] = 'L';
        ch[1] = 'O';
        ch[2] = 'V';
        ch[3] = 'E';
        ch[4] = 'I';
        ch[5] = 'S';
        
        // 배열값 모두 줄바꿈 없이 한줄로 출력 하시오.
        // 반복문 FOR
        System.out.println();
        System.out.println();
        for(int i=0; i<ch.length; i++){

            if(i==4){
                System.out.print(" "); // 4 i 앞에서 공간 벌린다.
            }
            System.out.print(ch[i]); // 출력 예시 LOVE IS
            // if(i==3){
            //     System.out.print(" "); // E 다음에 공간 벌린다.
            // }
        }
        System.out.println();
        System.out.println();





        // 반복문 WHILE
        int i = -1;
        while(i<ch.length-1){
            i++;
            System.out.print(ch[i]);
            if(i==3){
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println();

        

    }
}
