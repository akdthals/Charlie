
// public 은 모구 가져온다.
import mission.MissionAgent; // 패키지이름.클래스이름




public class J01_AccessModifier {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        // 생성자 생성  MissionAgent
        MissionAgent newMissionAgent= new MissionAgent();

        newMissionAgent.setName("톰 크로즈"); // public 메서드로 어디서든지 접근 가능
        newMissionAgent.codeNum = 403; // public 접근제한자로서 어디서든지 접근 가능하다. 
        
        newMissionAgent.showData();
        System.out.println();


        // 생성자 생성 Agent
        Agent newAgent = new Agent();

        newAgent.setName("Charlie");
        newAgent.setAge(11);

        // Agent에서 케터함수로 이름과 나이를 출력하라
        System.out.println("이름 : " + newAgent.getName() );
        System.out.println("나이 : " + newAgent.getAge() );
        System.out.println();
        System.out.println();


    }
}

class Agent{
    // private 맴버변수 지정
    // public 메서드 접근 지정
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {

        if(age<0){
            this.age = age * -1;  // 양수변환
        }
        else{
            this.age = age;
        }
        
    }

}

