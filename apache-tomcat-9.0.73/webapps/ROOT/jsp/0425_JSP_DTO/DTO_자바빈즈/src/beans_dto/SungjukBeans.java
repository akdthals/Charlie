package beans_dto;

/**
 * SungjukBeans
 * Sungjuk
 */
public class SungjukBeans {
    // 맴버변수 만들기
    // 자바빈즈 DTO 규칙 get...    set... 
    // 맴버변수는 반드시 private 선언
    private String name;
    private int kor;
    private int mat;
    private int eng;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMat() {
        return this.mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEng() {
        return this.eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

}