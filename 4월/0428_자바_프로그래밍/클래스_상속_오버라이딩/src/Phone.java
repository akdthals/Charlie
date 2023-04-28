/**
 * Phone
 */
public class Phone {
        private String name;
        private String telecom;
        private int price;

        public Phone(String name, String telecom, int price){
            this.name = name;
            this.telecom = telecom;
            this.price = price;
        }
        public void showData(){
            System.out.println("이름 : " + name + ", 통신사: " + telecom + ", 가격 : " + price + "만원");
        }
}

