package member;

public class member1{
    String id;
    String pw;
    String pwOk;
    String email;
    String hp;
    String Hpok;
    String addr;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return this.pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPwOk() {
        return this.pwOk;
    }

    public void setPwOk(String pwOk) {
        this.pwOk = pwOk;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return this.hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getHpok() {
        return this.Hpok;
    }

    public void setHpok(String hpok) {
        this.Hpok = hpok;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
    public void showData(){
        System.out.println("아이디 : " + getId());
        System.out.println();
        System.out.println("비밀번호 : " + getPw());
        System.out.println();
        System.out.println("비밀번호확인 : " + getPwOk());
        System.out.println();
        System.out.println("이메일 : " + getEmail());
        System.out.println();
        System.out.println("휴대폰번호 : " + getHp());
        System.out.println();
        System.out.println("휴대폰번호확인 : " + getHpok());
        System.out.println();
        System.out.println("주소 : " + getAddr());
    }

}
