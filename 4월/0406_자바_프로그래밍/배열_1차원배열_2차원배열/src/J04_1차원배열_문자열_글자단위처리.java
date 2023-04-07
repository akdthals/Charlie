public class J04_1차원배열_문자열_글자단위처리 {
    public static void main(String[] args) {
    

        // 문자열을 글자 단위로 출력
        // str.charAt(글자위치 0 ~ length();)
        String str = "winter";
        // System.out.println(str + ", " + str.charAt(0));
        // System.out.println(str + ", " + str.charAt(1));
        // System.out.println(str + ", " + str.charAt(2));
        // System.out.println(str + ", " + str.charAt(3));
        // System.out.println(str + ", " + str.charAt(4));
        // System.out.println(str + ", " + str.charAt(5));


        for(int i=0; i<str.length(); i++){
            System.out.println(str + ", " + str.toUpperCase().charAt(i));
            System.out.println(str + ", " + str.toLowerCase().charAt(i));

        }

        // 문제 summer 문자열을 문자 배열 생성하여 문자 단위로 저장한다.
        // 출력은 문자 배열만 출력하시오
         str = "summer";
        char[] ch = new char[str.length()];

        // for 문 이용 문자 배열 방에 글자단위로 저장
        for(int i=0; i<str.length(); i++){
            ch[i] = str.charAt(i);
        }
        System.out.println();
        System.out.println();

        // str 출력
        System.out.println(str);


        // while => 문자 배열 값 출력
        int i =-1;
        while(i<ch.length-1){
            i++;
            System.out.println("ch[" + i + "] =  " + ch[i]);
        }
        System.out.println();
        System.out.println();
    }
}
