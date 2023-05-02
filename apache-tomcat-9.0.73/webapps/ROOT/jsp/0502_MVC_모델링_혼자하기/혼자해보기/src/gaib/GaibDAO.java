package gaib;
import java.sql.*;

public class GaibDAO {
    private Connection conn = null;
    private PreparedStatement ps =null;
    public GaibDAO(){
        try{
            String DBURL = "jdbc:mysql://localhost:3306/sungmin";
            String DBID = "root";
            String DBPW = "1234";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DBURL, DBID, DBPW);
            System.out.println("데이터베이스 연결 성공!");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public int insert(GaibDTO gaibDTO){
        String SQL = "INSERT INTO gaib() VALUES(?,?,?,?,?)";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, gaibDTO.getUser_id());
            ps.setString(2, gaibDTO.getUser_pw());
            ps.setString(3, gaibDTO.getUser_name());
            ps.setString(4, gaibDTO.getUser_hp());
            ps.setString(5, gaibDTO.getUser_email());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

     public int update(GaibDTO gaibDTO) {
        String SQL = "UPDATE gaib_table SET user_pw = ?, user_name = ?, user_hp = ?, user_email = ? WHERE user_id = ? ";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, gaibDTO.getUser_pw());
            ps.setString(2, gaibDTO.getUser_name());
            ps.setString(3, gaibDTO.getUser_hp());
            ps.setString(4, gaibDTO.getUser_email());
            ps.setString(5, gaibDTO.getUser_id());
            return ps.executeUpdate();
        }
        catch( Exception e){
            e.printStackTrace();
        }
        return -1; 
    }



    
}
