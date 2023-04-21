package mission;

public class MissionAgent {

    String name;  // default 맴버변수
    public int codeNum; // public 맴버변수 : 중요한 비밀번호가 저장된다.

    public String getName(){  // getter 함수
        return name;
    }

    public void setName(String name){ // setter 함수
        this.name = name;
    }

    // 진짜 코드는 은닉화 관리한다. 
    private int getCodeNumber(){  // getter 함수
        return codeNum+2023;
    }

    public void showData(){
        System.out.println("이름 : " + getName());

        // private 맴버를 같은 클래스에서 접근하여 사용한다.
        System.out.println("코드번호 : " + getCodeNumber());
    }

}

// default 접근제한자
// class Agent{
//     // private 맴버변수 지정
//     // public 메서드 접근 지정
//     private String name;
//     private int age;

//     public String getName() {
//         return this.name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getAge() {
//         return this.age;
//     }

//     public void setAge(int age) {

//         if(age<0){
//             this.age = age * -1;  // 양수변환
//         }
//         else{
//             this.age = age;
//         }
        
//     }

// }
