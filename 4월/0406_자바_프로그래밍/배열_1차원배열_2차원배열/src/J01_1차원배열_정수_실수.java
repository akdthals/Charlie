/**
 * J01_1차원배열_정수_실수_문자_문자열
 */
public class J01_1차원배열_정수_실수 {

    public static void main(String[] args) {
        
        // 실수형 1차원 배열 생성하고 데이터를 대입하라
        double[] grade= {4.5,3.7,2.8,3.3,4.2,4.0,3.2}; // 7개 배열 갯수 (배열의길이)
        // double[] grade = new double[7]; // 7개 배열 갯수(배열의길이)

        // 문제1] 배열 값 => 배열 인덱스
        // 세번째 배열 인덱스를 이용 데이터 가져오기
        // 배열 이름[index number] index : 0 ~ n-1 : n은 배열의 총갯수-1
        // 배열 이름.길이 => gread.length => 결과 : 7 => 배열 인덱스 번호는 n-1이므로 7-1 = 6
        System.out.println("grade [0] = " + grade[0]);
        System.out.println("grade [1] = " + grade[1]);
        System.out.println("grade [2] = " + grade[2]);
        System.out.println("grade [3] = " + grade[3]);
        System.out.println("grade [4] = " + grade[4]);
        System.out.println("grade [5] = " + grade[5]);
        System.out.println("grade [6] = " + grade[6]);
        System.out.println();
        System.out.println();
        
        
        // 반복문(for(){}) 2 출력하라.
        // 반복문의 종료값은 grade.length 를 이용
        //////////////////////////////////////////////////////
        // 단 조건이 있다 점수가 3.5이상 인원수 카운트하라
        // 입력 
        // cnt = 0;
        
        // 처리
        // 1. 조건문 필요
        // 2. 카운트 누적변수 필요
        // 3. 총점(누적점수)


        // 출력 3.5이상 데이터 출력하고 그리고, 카운트 값 출력
        ///////////////////////////////////////////////////////
        int cnt = 0;
        double sum = 0.0;
        for(int i=0; i<grade.length; i++){
            if(grade[i]>=3.5){
                cnt++;
                sum+=grade[i];
                System.out.println("grade [" + i +  "] = " + grade[i]);
            }
          
        }
        System.out.println("성적 3.5 이상 인원수 = " + cnt + "명");
        System.out.println("성적 3.5 이상 총점 = " + sum + "점");
        System.out.println();
        // 반복문(while(){}) 2 출력하라.
        // 반복문의 종료값은 grade.length 를 이용
        int i=-1;
        cnt=0; //초기화
        sum=0; //초기화
        while(i<grade.length-1){ // i < 7 : (-1 0 1 2 3 4 5 6) 
            i++; // 0 1 2 3 4 5 6 
            if(grade[i]>=3.5){
                cnt++;
                sum+=grade[i];
                System.out.println("grade [" + i +  "] = " + grade[i]); // grade[i] 디버깅
            }
            
        }

        // 총점, 3.5이상 카운트 인원수
        System.out.println("3.5 이상 인원수 = " + cnt);
        System.out.println("3.5 이상 총점 = " + sum);
        System.out.println();

    }
}