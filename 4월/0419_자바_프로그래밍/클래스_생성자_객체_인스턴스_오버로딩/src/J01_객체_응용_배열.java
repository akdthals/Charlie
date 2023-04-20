public class J01_객체_응용_배열 {
    public static void main(String[] args) {
        
        // 단일 객체 사용         
        // 생성자 기본생성자,
        System.out.println();
        Waffle w1 = new Waffle();
		w1.showOrder();        

        // 매개변수 1개인 생성자	
		Waffle w2 = new Waffle("아이스크림");
		w2.showOrder();
        
        // 매개변수 2개인 생성자	
		Waffle w3 = new Waffle("허니버터와플", 3000);
		w3.showOrder();
        
        // 매개변수 3개인 생성자	
		Waffle w4 = new Waffle("핫소스 와플", 3000, 5);
		w4.showOrder();


        System.out.println();
        System.out.println("======= 객체 배쳘 처리 ==============");
        // 문제] 
        // 와플(waffle) 객체 만들고 그리고 생성자를 생성하되
        // 기본 생성자 와 멤버변수 값은 기본값 "기본고객"   가격은 0 설정
        // 생성자 매개변수는 2개다
        // 멤버변수는 구분(일반고객, 단골고객,  우수고객), 가격(5000, 10000, 15000)

        // 객체 배열 선언 사용 그리고 호출하기
        Waffle[] waf = new Waffle[6];

        waf[0] = new Waffle();
        waf[1] = new Waffle("바닐라와플");
        waf[2] = new Waffle("애플딸기와플", 25000);
        waf[3] = new Waffle("아이스크림와플", 15000,2);
        waf[4] = new Waffle("허니버터와플", 20000);
        waf[5] = new Waffle("허니와플", 10000, 10);        

        // 멤버함수(메서드) 호출 실행 6회 반복처리
        for(int i=0; i<waf.length; i++){
            waf[i].showOrder();
        }
         
        System.out.println();
    }
}


// 클래스 

class Waffle{
	// 필드(멤버변수)
	String 구분;
	int 가격;
	int 개수=1;

   
   
    // 기본생성자
	Waffle(){
		this.구분 = "기본고객";
		this.가격 = 0;
	}

	// 생성자(매개변수1개)
	public Waffle(String source) {
		this.구분 = source;	
        this.가격 = 0;	
	}
	
	// 생성자(매개변수2개)
	public Waffle(String source, int price) {
		this.구분 = source;
		this.가격 = price;
	}
	
	// 생성자(매개변수3개)
	public Waffle(String source, int price, int soo) {
		this.구분 = source;
		this.가격 = price;
		this.개수 = soo;
	}
	



	// 메소드(멤버함수)
	void showOrder() {
		System.out.println(this.구분+"와플 "+this.가격+"원 "+this.개수+"개");
	}
}
