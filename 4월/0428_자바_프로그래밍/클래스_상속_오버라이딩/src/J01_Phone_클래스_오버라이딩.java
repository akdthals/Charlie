/**
 * J01_Phone_클래스_오버라이딩
 * 
 * 기존의 Phone 이라는 클래스로 휴대폰 정보 관리 했으나 
 * 업데이트가 진행 되면서 새로운 정보들이 추가 되었다.
 * Phone 클래스는 그대로 사용, 상속을 하여
 * 추가된 정보들을 저장하도록 업그레이드를 한다.
 * 
 * 부모클래스 Phone 
 * 모든 필드는 private 접근제한자 사용한다.
 * 필드 : 이름, 통신사, 가격
 * 
 * 
 * 생성자
 * 
 * 메서드  showData
 * 
 * 
 * 
 * 메서드 오버라이딩
 * 자식클래스 업데이트폰 UpdatePhone
 * 할인카드(card), 보험기간(month)
 * 
 * 모든 필드를 초기화 하는 생성자
 * 
 * 
 * 오버 라이딩 메서드
 * 
 * 
 * 
        newPhone.setData("갤럭시", "SKT", 50);
        newPhone.showData();
 * 
 */
public class J01_Phone_클래스_오버라이딩 {

    public static void main(String[] args) {
       
        // 생성자 인스턴스 배열처리
        UpdatePhone[] P = new UpdatePhone[3];

        P[0] = new UpdatePhone("갤럭시", "SKT", 50, "삼성카드", 5);
        P[1] = new UpdatePhone("아이폰", "KT", 45, "롯데카드", 12);
        P[2] = new UpdatePhone("갤럭시", "SKT", 50, "신한카드", 7);


        for(int i=0; i<P.length; i++){
            P[i].showData();
        }
    }
    

}
