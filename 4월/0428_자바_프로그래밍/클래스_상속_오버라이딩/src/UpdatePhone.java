public class UpdatePhone extends Phone {
    private String card;
    private int month;


    public UpdatePhone(String name, String telecom, int price, String card, int month) {
        super(name,telecom,price);
        this.card = card;
        this.month = month;
    }
    public void showData(){
        super.showData();
        System.out.println("카드: " + card + ", 기간 : " + month + "개월" );
    }
}


