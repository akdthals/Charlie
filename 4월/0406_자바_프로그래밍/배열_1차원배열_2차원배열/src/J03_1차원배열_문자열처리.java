public class J03_1차원배열_문자열처리 {
    public static void main(String[] args) {
        // 문제1
        // 문자열 배열 선언하고 생성하기
        // 배열의 길이는 10개로 한다.
        // 데이터는 인기 스타 또는 연애인 이름 넣기
        // 타입(자료형) 지정[] 배열이름 = new 키워드 타입(자료형)지정[배열길이지정];
        // 1. 배열선언, 생성하기
        String[] names = new String[10];

        // 2. 배열 데이터 넣기
        names[0] = "아이유";
        names[1] = "카라";
        names[2] = "송중기";
        names[3] = "딘";
        names[4] = "윤하";
        names[5] = "걸스데이";
        names[6] = "해바리기";
        names[7] = "김유신";
        names[8] = "이순신";
        names[9] = "유인나";

        // for
        System.out.println();
        System.out.println();
        for(int i=0; i<names.length; i++){
            
            if(names[i].length()<=2){ // 이름이 2글자 이하인 이름만 출력
                System.out.println("names [" + i + "] = " + names[i]);
            }
            
        }
        System.out.println();
        System.out.println();



        // while
        // 배열전체 출력
        // 출력 예시) 이름 : 아이유 나오고 글자수 : 3 
        System.out.println();
        System.out.println();
        int i=-1;
        while(i<names.length-1){
            i++;
            System.out.println("이름: " + names[i] + ", 글자수: " + names[i].length());
        }
        System.out.println();
        System.out.println();

        // 문자열을 글자 단위로 출력
        String str = "winter";
        System.out.println(str + ", " + str.charAt(0));
        System.out.println(str + ", " + str.charAt(1));
        System.out.println(str + ", " + str.charAt(2));
        System.out.println(str + ", " + str.charAt(3));
        System.out.println(str + ", " + str.charAt(4));
        System.out.println(str + ", " + str.charAt(5));
    }
}
