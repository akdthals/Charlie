public class J02_성적처리 {
        public static void main(String[] args) {
            int kor, eng, mat;
            

            kor = 84;
            eng = 86;
            mat = 95;

            int tot = kor+eng+mat;

            double avg = (double)tot / 3;

  

            System.out.println("국어 " + kor);
            System.out.println("영어 " + eng);
            System.out.println("수학 " + mat);
            System.out.println("총점 " + tot);
            System.out.println("평균 " + avg);
        }
}
