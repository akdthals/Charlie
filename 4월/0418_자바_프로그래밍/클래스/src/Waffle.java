
// 외부클래스 제작
// 클래스 1개에 다양한 주문형식의 메서드가 선택되어 주문되어 진다.
class Waffle {
    // 리턴값이 있는 메서드 

    // 1. 매개변수 없는 메서드()
    String name(){
        return "와플";
    }
    // 2. 매개변수 1개 있는(문자열) 
    String name(String source1){
        return source1 + "와플";
    }
    // 3. 매개변수 2개(문자열, 문자열) 있는 메서드
    String name(String source1, String source2){
        return (source1 + source2) + "와플" ;
    }
    // 4. 매개변수 2개(문자열, 숫자) 있는 메서드
    String name(String source, int count){
        return source  + "와플" + count + "개";
    }
}

