package gaib;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;

public class GaibDAO {
    
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    
    public GaibDAO(){
        try{
            String dBURL = "jdbc:mysql://localhost:3306/user";
            String dBID = "root";
            String dBPW = "1234";

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dBURL, dBID, dBPW);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public int update(GaibDTO gaibDTO) {
        String SQL = "UPDATE gaib_table SET user_pw = ?,  user_name = ?,  user_hp = ?,  user_email = ?,  user_addr = ?   WHERE user_id = ? ";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, gaibDTO.getUser_pw());                      
            ps.setString(2, gaibDTO.getUser_name());                      
            ps.setString(3, gaibDTO.getUser_hp());                      
            ps.setString(4, gaibDTO.getUser_email());                      
            ps.setString(5, gaibDTO.getUser_addr());

            ps.setString(6, gaibDTO.getUser_id());
            return ps.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public int signup(GaibDTO gaibDTO) {
        String SQL = "INSERT INTO gaib_table(user_id, user_pw, user_name, user_hp, user_email, user_addr) VALUES(?, ?, ?, ?, ?, ?)";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, gaibDTO.getUser_id());
            ps.setString(2, gaibDTO.getUser_pw());
            ps.setString(3, gaibDTO.getUser_name());
            ps.setString(4, gaibDTO.getUser_hp());
            ps.setString(5, gaibDTO.getUser_email());
            ps.setString(6, gaibDTO.getUser_addr());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    public int delete(GaibDTO gaibDTO) {
        String SQL = "DELETE FROM gaib_table WHERE  user_id = ? AND user_hp = ?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, gaibDTO.getUser_id());
            ps.setString(2, gaibDTO.getUser_hp());
            return ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -1;
    }



    public int signin( String user_id, String user_pw ) {
        String SQL = "SELECT  user_pw  FROM  gaib_table   WHERE  user_id = ?";
        try{
            ps = conn.prepareStatement(SQL);
            ps.setString(1, user_id );
            ps.setString(2, user_pw );

            rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString(1).equals( user_pw )){
                    return 1;
                }
                else{
                    return 0;
                }
            }
            else{
                return -1;
            }            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return -2;
    }






}
